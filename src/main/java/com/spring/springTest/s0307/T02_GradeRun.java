package com.spring.springTest.s0307;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springTest.vo.GradeVo;

public class T02_GradeRun {
	
	public static void main(String[] args) {
		
		/*
		 * xml파일을 읽어오는 위치와 시점에 따른 4가지 Class
		 * ㆍClassPathXmlApplicationContext : classpath위치에서 xml을 읽음
		 * ㆍFileSystemXmlApplicationContext : 파일경로 위치에서
		 * ㆍXmlWebApplicationContext : 웹앱 위치에서
		 * ㆍAnnotationConfigApplicationContext : @Configuration이 붙은 클래스에서
		 * 
		 * 앞에 정의된 것들의 보편화된 클래스 : GenericXmlApplicationContext()
		 * 
		 * xml로 만든 파일을 스프링컨테이너에 bean으로 등록시켰으면, 호출시키는
		 * 'getBean("id")', 'getBean("id", 클리스)' 로 불러서 사용
		 */
		
//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/grade.xml");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("xml/grade.xml");
		
//		GradeVo vo = ctx.getBean("vo01", GradeVo.class);
//		GradeVo vo = (GradeVo) ctx.getBean("vo01");
		
		
		// 특정 타입(GradeVo)으로 등록된 모든 Bean 가져오기
        Map<String, GradeVo> gradeMap = ctx.getBeansOfType(GradeVo.class);

        // 모든 객체 반복 출력
        for (Map.Entry<String, GradeVo> entry : gradeMap.entrySet()) {
            System.out.println("Bean ID: " + entry.getKey());
            GradeVo vo = entry.getValue();
            System.out.println("name : " + vo.getName());
            System.out.println("kor : " + vo.getKor());
            System.out.println("eng : " + vo.getEng());
            System.out.println("math : " + vo.getMath());
            System.out.println("--------------------");
        }
        
	}
	
}
