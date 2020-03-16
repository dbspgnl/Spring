package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mtest {
	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		Emp kang = factory.getBean("kang", Emp.class);
		Emp park = factory.getBean("park", Emp.class);
		
		System.out.println(kang);
		System.out.println(park);
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
