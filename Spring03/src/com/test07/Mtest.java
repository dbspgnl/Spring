package com.test07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mtest {
	
	public static void main(String[] args) {
		
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("com/test07/applicationContext.xml");
		
		System.out.println("ioc container 생성");
		// lazy-init="true"을 설정하지 않으면 가장 늦게 출력된다. 
		
		TV ig = (TV) factory.getBean("ig");
		
		ig.powerOn();
		ig.powerOff();
		ig.volumeUp();
		ig.volumeDown();
	
	}
}
