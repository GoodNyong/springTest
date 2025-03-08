package com.spring.springTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.springTest.service.LogTestService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/aop")
public class AopController {
	
	@Autowired
	LogTestService logTestService;
	
	@RequestMapping(value = "/aopMenu", method = RequestMethod.GET)
	public String  aopMeneGet() {
		log.info("\n이곳은 AopController의 aopMenuGet()입니다.\n");
		return "aop/aopMenu";
	}
	
	@RequestMapping(value = "/aopTest01", method = RequestMethod.GET)
	public String  aopTest01Get() {
		logTestService.getLogTest01();
		return "aop/aopMenu";
	}
	
	@RequestMapping(value = "/aopTest02", method = RequestMethod.GET)
	public String  aopTest02Get(int num) {
		logTestService.getCalculator(num);
		return "aop/aopMenu";
	}
	
	@RequestMapping(value = "/aopTest03", method = RequestMethod.GET)
	public String  aopTest03Get() {
		logTestService.getEvenCalculator1();
		return "aop/aopMenu";
	}
	
	@RequestMapping(value = "/aopTest04", method = RequestMethod.GET)
	public String  aopTest04Get() {
		logTestService.getEvenCalculator2();
		return "aop/aopMenu";
	}
}
