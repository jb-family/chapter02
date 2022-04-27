package com.javaex.ex16;

public class Shape {
	//필드
	protected String fillColor;
	protected String lineColor;
	
	//생성자
	public Shape() {}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
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

	//메소드 - 일반
	
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	
	public void draw() {
		System.out.println("면색 :" + this.fillColor + " 선색 :" + this.lineColor + " 도형을 그렸습니다.");
	}
	
	public double area() {
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
