package com.spring.springTest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Component
@Aspect
public class AspectTest {
	// Advice
	// 종류 : Around(수행중에)/Before/After/AfterReturning(결과리턴후)/After-throwing(예외발생)
	
	// 문제 1 : LogTestService의 getLogTest01() 메소드 수행 '전/후'에 메세지 출력.
	// 아래 어노테이션이 PointCut(포인트컷)
	@Around("execution(* com.spring.springTest.service.LogTestService.getLogTest01(..))")
	public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("\n[출력위치] aop.AspectTest의 aroundAdvice()메소드 - getLogTest01 핵심코드 수행 (전) : ");
		
		joinPoint.proceed();
		
		System.out.println("[출력위치] aop.AspectTest의 aroundAdvice()메소드 - getLogTest01 핵심코드 수행 (후) : \n");
	}
	
	// 문제 2 : getCalculator() 메소드 수행 전에 메세지를 출력하세요.
	@Before("execution(* com.spring.springTest.service.LogTestService.getCalculator(..))")
	public void beforedAdvice() {
		System.out.println("\n[출력위치] aop.AspectTest의 beforedAdvice()메소드 - getLogTest01핵심코드 수행 (전) : ");
	}
	
	// 문제 3 : getCalculator() 메소드 반환값을 메세지를 출력하세요.
	@AfterReturning(value="execution(* com.spring.springTest.service.LogTestService.getCalculator(..))", returning="result")
	public void afterReturningAdvice(JoinPoint joinPoint, Object result) throws Throwable {
		System.out.println("\n[출력위치] aop.AspectTest의 afterReturningAdvice()메소드 - getLogTest01 핵심코드 수행 (결과) : " + result);
		
	}
	
	// 문제 4 : getEvenCalculator()메소드 수행 전/후에 log(숙제)
	
	
	// 문제 5 : getEvenCalculator()메소드의 수행시간을 찍어보세요
	long startTime, endTime;
	@Pointcut("execution(* com.spring.springTest.service.LogTestService.getEvenCalculator*(..))")
	private void cut() {}
	
	@Around("cut()")
	public void AroundAdvice2(ProceedingJoinPoint joinPoint) throws Throwable {
		startTime = System.nanoTime();
		joinPoint.proceed();
		endTime = System.nanoTime();
		
		// 수행시간
		long res = endTime - startTime;
		System.out.println("[출력위치] aop.AspectTest의 AroundAdvice2()메소드 - getEvenCalculator 핵심코드 수행 (경과시간) : " + res);
	}
	
	// 문제 6 : 서비스 객체를 모두(메소드)에서 수행시간을 출력하세요
	@Around("execution(* com.spring.springTest.service..*.*(..))")
	public Object AroundAdvice3(ProceedingJoinPoint joinPoint) throws Throwable {
		startTime = System.nanoTime();
		try {
			Object result = joinPoint.proceed();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			endTime = System.nanoTime();
			// 수행시간
			long res = endTime - startTime;
			System.out.println("[출력위치] aop.AspectTest의 AroundAdvice3()메소드 - LogTestService 메소드 수행 (경과시간) : " + res);
		}
		return "";
	}
		
}
