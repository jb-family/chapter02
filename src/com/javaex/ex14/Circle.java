package com.javaex.ex14;

public class Circle extends Figure{
	//필드
	protected int radius;
	//생성자
	
	public Circle() {}
	
	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor, radius);
	}

	//메소드 - gs
	public String getFillColor() {
		return fillColor;
	}
	
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	public String getLineColor() {
		return lineColor;
	}
	
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	//메소드 - 일반
	
	public void draw() {
		System.out.println("면색 :" + super.fillColor + ", 선색 :" + super.lineColor + ", 반지름 :" + super.radius +" 원을 그렸습니다.");	
	}
	
	
	
}
