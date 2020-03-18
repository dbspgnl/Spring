package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mtest {
	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		
		TV samsong = factory.getBean("samsong", TV.class);
		TV igTV = (TV) factory.getBean("igTV");
		
		samsong.powerOn();
		samsong.volumeUp();
		samsong.volumeDown();
		samsong.powerOff();
		
		igTV.powerOn();
		igTV.volumeUp();
		igTV.volumeDown();
		igTV.powerOff();
		
	}
}
