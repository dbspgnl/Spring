package com.edu.entity;

import org.springframework.stereotype.Component;

@Component("rect")
public class Rectangle extends Shape {
	
	public Rectangle() {
		this.setTitle("초기사각형");
		this.setWidth(10);
		this.setHeight(10);
	}

	public Rectangle(String title, int width, int height) {
		super(title, width, height);
	}

	@Override
	public void viewSize() {
		System.out.println(getTitle() + "의 넓이 : " + (getWidth() * getHeight()));
	}

}
