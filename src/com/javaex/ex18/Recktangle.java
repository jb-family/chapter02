package com.javaex.ex18;

public class Recktangle extends Shape implements Drawable{

	//필드
	private int width;
	private int height;
	
	
	
	//생성자
	public Recktangle() {
		super();
	}
	
	public Recktangle(String fillColor, String lineColor, int width, int height) {
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
	
	
	//인터페이스 구현
	public void draw() {
		System.out.println("면색 :" + super.fillColor + " 선색 :" + super.lineColor + " 가로 : " + this.width + " 세로 : " + this.height + " 사각형을 그렸습니다.");
	}

	@Override
	public String toString() {
		return "Recktangle [width=" + width + ", height=" + height + ", getWidth()=" + getWidth() + ", getHeight()="
				+ getHeight() + "]";
	}

	// 추상메서드
	public double area() {
		double area = width * height;
		return area;
	}
	
	
	
	
	
	
	
	
	
	
}
