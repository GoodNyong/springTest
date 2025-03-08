package com.spring.springTest.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class LogTestService {
	
	public void getLogTest01() {
		System.out.println();
		log.info("이곳은 LogTestService객체의 getLogTest01()메소드 입니다.");
		System.out.println();
	}
	
	public int getCalculator(int num) {
		int tot = 0;
		for(int i = 1; i<= num; i++) {
			tot += i;
		}
		System.out.println();
		log.info("1에서 {} 까지의 합은 {} 입니다.", num, tot);
		System.out.println();
		return tot;
	}
	
	public void getEvenCalculator1() {
		int tot = 0;
		for(int i = 0; i<= 1000000; i+=2) {
			tot += i;
		}
		System.out.println();
		log.info("1에서  1000000까지의 짝수합은 {} 입니다.(for)", tot);
		System.out.println();
		
	}

	public void getEvenCalculator2() {
		int i = 0, tot = 0;
		while(i<1000000) {
			i += 2;
			tot += i;
		}
		System.out.println();
		log.info("1에서  1000000까지의 짝수합은 {} 입니다.(while)", tot);
		System.out.println();
	}
}
