package com.dute.officialNetwork.service;

public interface RedisService {
	void set(String key, String value);

	String get(String key);
}
