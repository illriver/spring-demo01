package com.illriver.service;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {
	public String sayHello(String world) {
		return "Hello " +world+"!";
	}

}
