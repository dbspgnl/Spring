package com.test02;

public class Address {
	
	private String name;
	private String addr;
	private String phone;
	
	public Address() {
		this.name = "홍길동";
		this.addr = "경기도 수원시";
		this.phone = "010-0000-0000";
	}
	
	public Address(String name, String addr, String phone) {
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}
	
	public String toString() {
		return "이름: " + name + "\t 주소: "+addr+"\t 전화번호: "+phone;
	}
}
