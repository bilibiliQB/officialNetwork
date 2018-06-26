package com.dute.officialNetwork.service.interfaces;

public interface RedisService {
	void set(String key, Object value);

	Object get(String key);
}
