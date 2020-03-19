package com.test01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Before;

public class MyAdvice {
	
	@Before("execute(public * *(..))")
	public void beforeSaying(JoinPoint join) {
		System.out.println("당신의 이름은 무엇입니까?");
	}
	@After("execute(public * *(..))")
	public void afterSaying(JoinPoint join) {
		System.out.println("이름이 멋지시네요.");
	}
	@AfterReturning("execute(public * *(..))")
	public void afterReturnSaying(JoinPoint join) {
		System.out.println();
	}

}
