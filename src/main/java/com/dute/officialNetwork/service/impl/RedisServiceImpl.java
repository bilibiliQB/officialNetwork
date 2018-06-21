package com.dute.officialNetwork.service.impl;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.service.RedisService;

@Service
public class RedisServiceImpl implements RedisService {

	@Resource
	private RedisTemplate<String, String> rt;

	@Override
	public void set(String key, String value) {
		ValueOperations<String, String> vo = rt.opsForValue();
		vo.set(key, value);
	}

	@Override
	public String get(String key) {
		ValueOperations<String, String> vo = rt.opsForValue();
		return vo.get(key);
	}

}
