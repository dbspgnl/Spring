package com.test04;

public class Man implements Person {

	@Override
	public String classWork() {
		//String s = null;
		//s.length(); // nullPointException: afterthrowing이 동작한다. 
		System.out.println("컴퓨터를 켜고 게임을 한다.");
		return "롤";
	}

}
