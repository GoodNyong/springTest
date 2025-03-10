package com.spring.springTest.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.springTest.service.BmiService;
import com.spring.springTest.service.GradeService;
import com.spring.springTest.vo.BmiVo;
import com.spring.springTest.vo.GradeVo;

@Controller
@RequestMapping("/0307")
public class T0307Controller {

	@RequestMapping(value = "/test01", method = RequestMethod.GET)
	public String test01Get() {
		return "/0307/test01";
	}

	@RequestMapping("/xmlMenu")
	public String xmlMenuGet() {
		return "0307/xmlMenu";
	}

	@RequestMapping("/test02")
	public String test02Get(Model model) {
		// 가져오기
		ApplicationContext ctx = new ClassPathXmlApplicationContext("xml/grade.xml");
		// 특정 타입(GradeVo)으로 등록된 모든 Bean 가져오기
		Map<String, GradeVo> gradeMap = ctx.getBeansOfType(GradeVo.class);

		// 모델에 담아 전달
		model.addAttribute("gradeMap", gradeMap);

		return "0307/test02";
	}

	@RequestMapping("/test03")
	public String test03Get(Model model) {
		// 가져오기
		ApplicationContext ctx = new ClassPathXmlApplicationContext("xml/grade.xml");
		// 특정 타입(GradeVo)으로 등록된 모든 Bean 가져오기
		List<GradeVo> vos = new ArrayList<>(ctx.getBeansOfType(GradeVo.class).values());
		// 서비스 객체 생성
		GradeService service = new GradeService();
		// 모든 객체에게 계산을 수행
		for (GradeVo vo : vos)
			service.calc(vo);
		// 모델에 담아 전달
		model.addAttribute("gradeCalcList", vos);
		return "0307/test03";
	}

	@RequestMapping(value = "/test04", method = RequestMethod.GET)
	public String test04Get() {
		return "/0307/test04";
	}

	@Autowired
	private BmiService bmiService;

	@RequestMapping(value = "/test05", method = RequestMethod.GET)
	public String test05Get(Model model) {
		List<BmiVo> bmiList = bmiService.getBmiList();
		for (BmiVo vo : bmiList) {
			vo.setBmi(vo.calculateBmi()); // BMI 값 설정
			vo.setResult(vo.getBmiCategory()); // 결과 값 설정
		}
		model.addAttribute("bmiList", bmiList);
		return "/0307/test05";
	}

	@RequestMapping(value = "/test05", method = RequestMethod.POST)
	public String test05Post(@RequestParam("name") String name,
			@RequestParam("height") double height,
			@RequestParam("weight") double weight) {
		bmiService.addBmiData(name, height, weight);
		return "redirect:/0307/test05";
	}

}
