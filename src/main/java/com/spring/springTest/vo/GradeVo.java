package com.spring.springTest.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GradeVo {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private String grade;
}
