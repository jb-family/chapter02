package com.javaex.ex15;

public class Racktangle extends Shape {

	//필드
	private int width;
	private int height;
	
	
	
	//생성자
	public Racktangle() {
		super();
	}
	
	public Racktangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}

	
	//메소드 - gs
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
	
	
	
	//메소드 - 일반
	
	public void draw() {
		System.out.println("면색 :" + super.fillColor + " 선색 :" + super.lineColor + " 가로 : " + this.width + " 세로 : " + this.height + " 사각형을 그렸습니다.");
	}
	
}
