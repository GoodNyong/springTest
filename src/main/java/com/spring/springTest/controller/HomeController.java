package com.spring.springTest.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/logTest", method = RequestMethod.GET)
	public String logTestGet() {
		/*
		 * 로깅레벨(Logging Level) : trace/debug/info/warning/error/fatal
		 * 디버깅 목적으로 사용하는 것 : trace/debug
		 */
		Date today = new Date();
		System.out.println("===========================================");
		logger.info("Logger 객체를 이용한 로그 출력");
		logger.trace("1.지금은 {} 입니다.", today); // 출력 안됨
		logger.debug("2.지금은 {} 입니다.", today); // 출력 안됨
		logger.info("3.지금은 {} 입니다.", today);
		logger.warn("4.지금은 {} 입니다.", today);
		logger.error("5.지금은 {} 입니다.", today);
//		logger.fatal("6.지금은 {} 입니다.", today); // 없음
		System.out.println("============================================");
		log.info("Lombok라이브러리를 이용한 출력(@slf4j");
		log.trace("1.지금은 {} 입니다.", today); // 출력 안됨
		log.debug("2.지금은 {} 입니다.", today); // 출력 안됨
		log.info("3.지금은 {} 입니다.", today);
		log.warn("4.지금은 {} 입니다.", today);
		log.error("5.지금은 {} 입니다.", today);
		System.out.println("===========================================");
		//컨트롤러에 보내려면 redirect로 보내야한다.
		return "redirect:/message/goHome";
	}
	
}
