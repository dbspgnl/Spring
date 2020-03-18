package com.test03;

import org.springframework.stereotype.Component;

@Component
public class igTV implements TV {

	public igTV() {
		System.out.println("ig tv 생성!");
	}
	
	@Override
	public void powerOn() {
		System.out.println("ig tv power on");
	}

	@Override
	public void powerOff() {
		System.out.println("ig tv power off");
	}

	@Override
	public void volumeUp() {
		System.out.println("ig tv volume up");
	}

	@Override
	public void volumeDown() {
		System.out.println("ig tv volume down");
	}

}
