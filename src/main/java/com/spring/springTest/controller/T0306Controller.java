package com.spring.springTest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.springTest.vo.TestVo;

@Controller
@RequestMapping("/0306")
public class T0306Controller {

//	@RequestMapping("/0306/test1")
//	@RequestMapping("/test1")
//	@GetMapping("/test1")
	@RequestMapping(value = "/test01", method = RequestMethod.GET)
	public String test01Get() {
		return "0306/test01";
	}

	@RequestMapping(value = "/test02", method = RequestMethod.GET)
	public String test02Get(Model model) {
		model.addAttribute("message", "안녕하세요");

		return "0306/test02";
	}

	@RequestMapping(value = "/test03", method = RequestMethod.GET)
	public String test03Get(HttpServletRequest request) {
		request.setAttribute("message", "반갑습니다.");

		return "0306/test03";
	}

	@RequestMapping(value = "/test04", method = RequestMethod.GET)
	public String test04Get(HttpServletRequest request) {
		String name = "홍길동";
		int age = 20;
		String gender = "남";
		String address = "서울";

		request.setAttribute("name", name);
		request.setAttribute("age", age);
		request.setAttribute("gender", gender);
		request.setAttribute("address", address);

		return "0306/test04";
	}

	@RequestMapping(value = "/test05", method = RequestMethod.GET)
	public String test05Get(HttpServletRequest request) {
		request.setAttribute("message", "반갑습니다.");

		return "0306/test05";
	}

	@RequestMapping(value = "/test05", method = RequestMethod.POST)
	public String test05Post(HttpServletRequest request) {
		String name = request.getParameterValues("name") == null ? "" : request.getParameter("name");
		int age = request.getParameterValues("age") == null ? 0 : Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameterValues("gender") == null ? "" : request.getParameter("gender");
		String address = request.getParameterValues("address") == null ? "" : request.getParameter("address");

		request.setAttribute("name", name);
		request.setAttribute("age", age);
		request.setAttribute("gender", gender);
		request.setAttribute("address", address);

		return "0306/test05_OK";
	}

	@RequestMapping(value = "/test06", method = RequestMethod.GET)
	public String test06Get(HttpServletRequest request) {
		request.setAttribute("message", "반갑습니다.");

		return "0306/test06";
	}

//	@RequestMapping(value = "/test06", method = RequestMethod.POST)
//	public String test06Post(HttpServletRequest request, TestVo vo) {
//		String name = request.getParameterValues("name") == null ? "" : request.getParameter("name");
//		int age = request.getParameterValues("age") == null ? 0 : Integer.parseInt(request.getParameter("age"));
//		String gender = request.getParameterValues("gender") == null ? "" : request.getParameter("gender");
//		String address = request.getParameterValues("address") == null ? "" : request.getParameter("address");
//
//		// TestVo vo = new TestVo(); vo.setName(name); vo.setAge(age);
//		vo.setGender(gender);
//		vo.setAddress(address);
//
//		request.setAttribute("vo", vo);
//
//		return "0306/test06_OK";
//	}
//
//	@RequestMapping(value = "/test06", method = RequestMethod.POST)
//	public String test06Post(HttpServletRequest request, TestVo vo, String name, int age, String gender,
//			String address) {
//		name = request.getParameterValues("name") == null ? "" : request.getParameter("name");
//		age = request.getParameterValues("age") == null ? 0 : Integer.parseInt(request.getParameter("age"));
//		gender = request.getParameterValues("gender") == null ? "" : request.getParameter("gender");
//		address = request.getParameterValues("address") == null ? "" : request.getParameter("address");
//
//		vo.setName(name);
//		vo.setAge(age);
//		vo.setGender(gender);
//		vo.setAddress(address);
//
//		request.setAttribute("vo", vo);
//
//		return "0306/test06_OK";
//	}
//
//	@RequestMapping(value = "/test06", method = RequestMethod.POST)
//	public String test06Post(HttpServletRequest request, TestVo vo, String name, int age, String gender,
//			String address) {
//		vo.setName(name);
//		vo.setAge(age);
//		vo.setGender(gender);
//		vo.setAddress(address);
//
//		request.setAttribute("vo", vo);
//
//		return "0306/test06_OK";
//	}
//
//	@RequestMapping(value = "/test06", method = RequestMethod.POST)
//	public String test06Post(HttpServletRequest request, TestVo vo) {
//
//		request.setAttribute("vo", vo);
//
//		return "0306/test06_OK";
//	}

	@RequestMapping(value = "/test06", method = RequestMethod.POST)
	public String test06Post(Model model, TestVo vo) {
		model.addAttribute("vo", vo);
		return "0306/test06_OK";
	}

	@RequestMapping(value = "/test07", method = RequestMethod.GET)
	public String test07Get() {
		return "0306/test07";
	}

	@RequestMapping(value = "/test07", method = RequestMethod.POST)
	public String test07Post(Model model, TestVo vo,
//			String name
			@RequestParam(name = "name") String irum,
//			@RequestParam(name="mid", required = false) String mid,
			@RequestParam(name = "mid", defaultValue = "입력하지 않음", required = false) String mid,
//			int age,
			@RequestParam(name = "age", defaultValue = "20", required = false) int age, String gender, String address,
//			String job,
			@RequestParam(name = "job", defaultValue = "입력하지 않음") String job) {
//		String irum = name;
		vo.setName(irum);
		vo.setMid(mid);
		vo.setAge(age);
		vo.setGender(gender);
		vo.setAddress(address);
		vo.setJob(job);
		model.addAttribute("vo", vo);
		return "0306/test07_OK";
	}

	@RequestMapping(value = "/test08", method = RequestMethod.GET)
	public String test08Get() {
		return "0306/test08";
	}

//	@RequestMapping(value = "/test08_OK/{name}/{age}", method = RequestMethod.GET)
//	@RequestMapping(value = "/test08_OK/{name}-{age}", method = RequestMethod.GET)
//	@RequestMapping(value = "/test08_OK/{name}@@@@@{age}", method = RequestMethod.GET)
	@RequestMapping(value = "/{name}/test08_OK/{age}", method = RequestMethod.GET)
	public String test08_OKGet(Model model, TestVo vo, @PathVariable String name, @PathVariable int age) {
		model.addAttribute("vo", vo);
		return "0306/test08_OK";
	}

	@RequestMapping(value = "/test09", method = RequestMethod.GET)
	public String test09Get() {
		return "0306/test09";
	}

	@RequestMapping(value = "/test09", method = RequestMethod.POST)
	public ModelAndView test09Post(TestVo vo) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("vo", vo);
		mv.setViewName("0306/test09_OK");
		return mv;
	}

	@RequestMapping(value = "/test10", method = RequestMethod.GET)
	public String test10Get() {
		return "0306/test10";
	}

	@RequestMapping(value = "/test10_OK/{eid}", method = RequestMethod.GET)
	public String test10Post(@PathVariable String eid, Model model) {
		String team = "";

		if (eid.substring(0, 1).toLowerCase().equals("i"))
			team = "인사과";
		else if (eid.substring(0, 1).toLowerCase().equals("c"))
			team = "총무과";
		else if (eid.substring(0, 1).toLowerCase().equals("s"))
			team = "생산과";
		else
			team = "기타";

		eid = eid.substring(1);
		model.addAttribute("team", team);
		model.addAttribute("eid", eid);

		return "0306/test10_OK";
	}

	@RequestMapping(value = "/test11", method = RequestMethod.GET)
	public String test11Get() {
		return "0306/test11";
	}

	@RequestMapping(value = "/test11", method = RequestMethod.POST)
	public String test11Post(Model model, TestVo vo, HttpServletRequest request) {
		String team = "";
		if (vo.getEid().substring(0, 1).toLowerCase().equals("i"))
			team = "인사과";
		else if (vo.getEid().substring(0, 1).toLowerCase().equals("c"))
			team = "총무과;";
		else if (vo.getEid().substring(0, 1).toLowerCase().equals("s"))
			team = " 생산과";
		else
			team = "기타";

		vo.setEid(vo.getEid().substring(1));
		vo.setTeam(team);

		model.addAttribute("vo", vo);

		model.addAttribute("message", "회원가입에 성공하셨습니다.");
		model.addAttribute("url", "/0306/test11_OK?" + "team=" + vo.getTeam() + "&eid="
				+ vo.getEid() + "&name=" + vo.getName());

		return "include/message";
	}

	@RequestMapping(value = "/test11_OK", method = RequestMethod.GET)
	public String test11_OKPost(Model model, TestVo vo) {
		model.addAttribute("vo", vo);
		return "0306/test11_OK";
	}

	@RequestMapping(value = "/test12", method = RequestMethod.GET)
	public String test12Get() {
		return "0306/test12";
	}

	@RequestMapping(value = "/test12", method = RequestMethod.POST)
	public String test12Post(Model model, TestVo vo) {
		String team = "";

		if (vo.getEid().substring(0, 1).toLowerCase().equals("i"))
			team = "인사과";
		else if (vo.getEid().substring(0, 1).toLowerCase().equals("c"))
			team = "총무과";
		else if (vo.getEid().substring(0, 1).toLowerCase().equals("s"))
			team = "생산과";
		else
			team = "기타";

		vo.setEid(vo.getEid().substring(1));
		vo.setTeam(team);

		model.addAttribute("vo", vo);
		return "0306/test12";
	}

	@RequestMapping(value = "/test13", method = RequestMethod.GET)
	public String test13Get() {
		return "0306/test13";
	}

	@RequestMapping(value = "/test13", method = RequestMethod.POST)
	public String test13Post(Model model, TestVo vo) {
		String flag = vo.getEid().substring(0, 1).toLowerCase();

		if (!flag.equals("i") && !flag.equals("c") && !flag.equals("s")) {
			model.addAttribute("message", "정회원이 아닙니다.");
		} else {
			String team = flag.equals("i") ? "인사과" : flag.equals("c") ? "총무과" : "생산과";
			vo.setTeam(team);
			model.addAttribute("vo", vo);
			model.addAttribute("message", "정회원님 반갑습니다.");
		}

		return "0306/test13";
	}
	
	@RequestMapping(value = "/test14", method = RequestMethod.GET)
	public String test14Get() {
		return "0306/test14";
	}
	
	@RequestMapping(value = "/test14", method = RequestMethod.POST)
	public String test14Post(TestVo vo, HttpSession session) {
		String flag = vo.getEid().substring(0, 1).toLowerCase();
		String msgFlag = "";

		if (!flag.equals("i") && !flag.equals("c") && !flag.equals("s")) {
			msgFlag = "notMember";
		} else {
			String team = flag.equals("i") ? "인사과" : flag.equals("c") ? "총무과" : "생산과";
			vo.setTeam(team);
			session.setAttribute("vo", vo);
			session.setMaxInactiveInterval(180);
			msgFlag = "Member";
		}

		return "redirect:/message/" + msgFlag;
	}
}
