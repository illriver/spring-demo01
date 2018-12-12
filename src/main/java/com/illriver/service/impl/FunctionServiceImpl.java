package com.illriver.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.illriver.service.FunctionService;

@Service
public class FunctionServiceImpl {
	
	@Autowired
	FunctionService functionService;
	
	public String SayHello(String world) {
		return functionService.sayHello(world);
	}
}
