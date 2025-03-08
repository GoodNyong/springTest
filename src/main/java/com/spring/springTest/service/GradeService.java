package com.spring.springTest.service;

import com.spring.springTest.vo.GradeVo;

public class GradeService {
	
	public void getLine() {
		System.out.println("=========================================================================================");
	}
	
	public void calc(GradeVo vo) {
		int tot = vo.getKor() + vo.getEng() + vo.getMath();
		double avg = tot / 3.0;
		String grade = "";
		if(avg >= 90) grade = "A";
		else if(avg >= 80) grade = "B";
		else if(avg >= 70) grade = "C";
		else if(avg >= 60) grade = "D";
		else grade = "F";
		
		vo.setTot(tot);
		vo.setAvg(avg);
		vo.setGrade(grade);
//		gradePrint(vo);
	}

//	private void gradePrint(GradeVo vo) {
//		System.out.println(vo.toString());
//	}
	
}
