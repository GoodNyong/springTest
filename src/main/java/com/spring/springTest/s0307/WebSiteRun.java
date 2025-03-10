package com.spring.springTest.s0307;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.springTest.vo.WebSiteVo;

public class WebSiteRun {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("xml/webSite2.xml");
		
		WebSiteVo infor = (WebSiteVo) ctx.getBean("infor2");
		
		System.out.println("\n------------------------------------------------");
		System.out.println("[WebSiteRun.java]");
		System.out.println("driver : " + infor.getDriver());
		System.out.println("url : " + infor.getUrl());
		System.out.println("user : " + infor.getUser());
		System.out.println("password : " + infor.getPassword());
		System.out.println("------------------------------------------------\n");
		
		ctx.close();
	}
}
