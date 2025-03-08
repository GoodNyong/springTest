package com.spring.springTest.s0307;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springTest.service.GradeService;
import com.spring.springTest.vo.GradeVo;

public class T03_GradeCalcRun {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("xml/grade.xml");
		
//		GradeVo vo01 = null;
//		GradeVo vo02 = null;
//		GradeVo vo03 = null;
//		vo01 = (GradeVo) ctx.getBean("vo01");
//		vo02 = (GradeVo) ctx.getBean("vo02");
//		vo03 = (GradeVo) ctx.getBean("vo03");
//		
//		int tot = vo01.getKor() + vo01.getEng() + vo01.getMath();
//		double avg = tot / 3.0;
//		String grade = "";
//		if(avg>=90) grade = "A";
//		else if(avg>=80) grade = "B";
//		else if(avg>=70) grade = "C";
//		else if(avg>=60) grade = "D";
//		else grade = "F";
//		
//		System.out.println("==========================");
//		System.out.println("셩명 : "+vo01.getName());
//		System.out.println("국어 : "+vo01.getKor());
//		System.out.println("영어 : "+vo01.getEng());
//		System.out.println("수학 : "+vo01.getMath());
//		System.out.println("총점 : "+tot);
//		System.out.println("평균 : "+avg);
//		System.out.println("학점 : "+grade);
//		System.out.println("==========================");
		
		List<GradeVo> vos = new ArrayList<GradeVo>();
		GradeVo vo = null;
		
		vo = (GradeVo) ctx.getBean("vo01");
		vos.add(vo);
		vo = (GradeVo) ctx.getBean("vo02");
		vos.add(vo);
		vo = (GradeVo) ctx.getBean("vo03");
		vos.add(vo);
		
		GradeService service = new GradeService();
		
		service.getLine();
		for (GradeVo gradeVo : vos) {
			service.calc(gradeVo);
		}
		service.getLine();
		
//		ctx.close();
	}
}
