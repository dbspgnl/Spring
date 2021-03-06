package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mtest {
	public static void main(String[] args) {
		
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("com/test01/applicationContext.xml");
		MessageBean bean = (MessageBean) factory.getBean("banana");
		bean.sayHello();
		MessageBean mango = (MessageBean) factory.getBean("mango");
		mango.sayHello();
		MessageBean grape = (MessageBean) factory.getBean("banana");
		grape.sayHello();
	}
}
