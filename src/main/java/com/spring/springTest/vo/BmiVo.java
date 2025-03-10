package com.spring.springTest.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BmiVo {
	private String name;
    private double height;
    private double weight;
    private double bmi;
    private String result;
	
	 public BmiVo() {}

	    public BmiVo(String name, double height, double weight) {
	        this.name = name;
	        this.height = height;
	        this.weight = weight;
	    }
	  
	    public double calculateBmi() {
	        double heightMeter = height / 100.0;
	        return weight / (heightMeter * heightMeter);
	    }

	    public String getBmiCategory() {
	        double bmi = calculateBmi();
	        if (bmi < 18.5) return "저체중";
	        else if (bmi < 24.9) return "정상 체중";
	        else if (bmi < 29.9) return "과체중";
	        else return "비만";
	    }
}
