package com.illriver.springboot_demo01;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.illriver.config.Diconfig;
import com.illriver.service.impl.FunctionServiceImpl;

public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Diconfig.class);
		FunctionServiceImpl functionServiceImpl = context.getBean(FunctionServiceImpl.class);
		System.out.println(functionServiceImpl.SayHello("myfridents"));
		context.close();
		
	}

}
