package com.spring.springTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MessageController {
	@RequestMapping(value = "/message/{msgFlag}", method = RequestMethod.GET)
	public String getMessage(Model model, @PathVariable String msgFlag,
			@RequestParam(name="mid", defaultValue = "", required = false) String mid
		) {
		if(msgFlag.equals("notMember")) {
			model.addAttribute("message", "정회원이 아닙니다.\\n회원가입을 해주세요");
			model.addAttribute("url", "/");
		}
		else if(msgFlag.equals("Member")) {
			model.addAttribute("message", "정회원님 반갑습니다.");
			model.addAttribute("url", "/0306/test13");
		}
		else if(msgFlag.equals("goHome")) {
			model.addAttribute("message", "홈으로 갑니다.");
			model.addAttribute("url", "/");
		}
		return "include/message";
	}
	
}
