package com.spring.springTest.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.springTest.controller.HelloController;

public class HelloMain {
	public static void main(String[] args) {
		AbstractApplicationContext ctx =  new GenericXmlApplicationContext("application-config.xml");
		HelloController ctr =  ctx.getBean(HelloController.class);
		ctr.hello("홍길동");
		ctr =  ctx.getBean(HelloController.class);
		ctr.hello("김말숙");
		ctx.destroy();
		ctx.close();
	}
}
