package com.spring.springTest.controller;

import com.spring.springTest.service.IHelloService;

public class HelloController {

//	@Autowired
//	IHelloService iHelloService;
//	private IHelloService iHelloService;

//	setter로 값 주입(의존성 주입)
//	public void setiHelloService(IHelloService iHelloService) {
//		this.iHelloService = iHelloService;
//	}

//	생성자로 한 번 입력되면 변경 불가(생성자로 의존성 주입)
	private final IHelloService iHelloService;

	public HelloController(IHelloService iHelloService) {
		this.iHelloService = iHelloService;
	}

//	이름을 매개갮으로 받아, 그 값을 서비스 객체에서 처리, 반환 받은 후 컨트롤러에서 그 결과를 출력
	public void hello(String name) {
		String res = iHelloService.sayHello(name);
		System.out.println("\n[HelloController]");
		System.out.println(res+"\n");
	}
}
