package com.dute.officialNetwork.redis;

import java.time.Duration;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.cache.Cache;
import org.springframework.data.redis.cache.RedisCache;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;

public class CustomizedRedisCacheManager extends RedisCacheManager {

	private final RedisCacheConfiguration defaultCacheConfiguration;
	private final ConcurrentMap<String, Cache> cacheMap = new ConcurrentHashMap<>(16);
	private volatile Set<String> cacheNames = Collections.emptySet();

	/**
	 * 缓存参数的分隔符 数组元素0=缓存的名称 数组元素1=缓存过期时间TTL
	 */
	private static final String SEPARATOR = "#";

	public CustomizedRedisCacheManager(RedisCacheWriter cacheWriter,
			RedisCacheConfiguration defaultCacheConfiguration) {
		super(cacheWriter, defaultCacheConfiguration);
		this.defaultCacheConfiguration = defaultCacheConfiguration;
	}

	@Override
	public Cache getCache(String name) {
		if (name == null) {
			super.getCache(name);
		}

		String[] cacheParams = name.split(SEPARATOR);
		String cacheName = cacheParams[0];

		Cache cache = this.cacheMap.get(cacheName);
		if (cache != null) {
			return cache;
		} else {
			synchronized (this.cacheMap) {
				cache = this.cacheMap.get(cacheName);
				if (cache == null) {
					if (cacheParams.length == 2) {
						String timeStr = cacheParams[1].toLowerCase();
						Long time = null;
						if (timeStr.indexOf("s") != -1) {
							// 时间单位：秒
							time = Long.valueOf(timeStr.replace("s", ""));
							cache = getMissingCache(cacheName, Duration.ofSeconds(time));
						} else if (timeStr.indexOf("m") != -1) {
							// 时间单位：分钟
							time = Long.valueOf(timeStr.replace("m", ""));
							cache = getMissingCache(cacheName, Duration.ofMinutes(time));
						} else if (timeStr.indexOf("h") != -1) {
							// 时间单位：小时
							time = Long.valueOf(timeStr.replace("h", ""));
							cache = getMissingCache(cacheName, Duration.ofHours(time));
						} else if (timeStr.indexOf("d") != -1) {
							// 时间单位：天
							time = Long.valueOf(timeStr.replace("d", ""));
							cache = getMissingCache(cacheName, Duration.ofDays(time));
						} else {
							throw new RuntimeException("未识别的时间单位[s 秒/m 分钟/h 小时/d 天]");
						}
					} else {
						cache = getMissingCache(cacheName);
					}
					if (cache != null) {
						cache = decorateCache(cache);
						this.cacheMap.put(cacheName, cache);
						updateCacheNames(cacheName);
					}
				}
				return cache;
			}
		}

	}

	private void updateCacheNames(String name) {
		Set<String> cacheNames = new LinkedHashSet<>(this.cacheNames.size() + 1);
		cacheNames.addAll(this.cacheNames);
		cacheNames.add(name);
		this.cacheNames = Collections.unmodifiableSet(cacheNames);
	}

	private RedisCache getMissingCache(String name, Duration time) {
		RedisCacheConfiguration cacheConfig = defaultCacheConfiguration.entryTtl(time);
		return super.createRedisCache(name, cacheConfig);
	}

}
