package com.dute.officialNetwork.service.impl;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import com.dute.officialNetwork.service.interfaces.RedisService;

@Service
public class RedisServiceImpl implements RedisService {

	@Resource
	private RedisTemplate<String, Object> rt;

	@Override
	public void set(String key, Object value) {
		ValueOperations<String, Object> vo = rt.opsForValue();
		vo.set(key, value);
	}

	@Override
	public Object get(String key) {
		ValueOperations<String, Object> vo = rt.opsForValue();
		return vo.get(key);
	}

}
