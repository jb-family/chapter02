package com.javaex.ex14;

public class Figure {

	//필드
	protected String fillColor;
	protected String lineColor;
	protected int width;
	protected int height;
	protected int radius;
	
	//생성자
	public Figure() {}
	
	
	
	public Figure(String fillColor, String lineColor, int width, int height) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		this.width = width;
		this.height = height;
	}
	
	public Figure(String fillColor, String lineColor) {
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

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//메소드 - 일반
	
	public void draw() {
		System.out.println("면색 :" + this.fillColor + "선색 :" + this.lineColor);
	}
}
