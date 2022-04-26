package com.javaex.ex14;

public class Ractangle extends Figure {
	//필드

	//생성자
	
	public Ractangle() {}
	
	
	public Ractangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor, width, height);
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
	
	//메소드 - 일반
	
	public void draw() {
		System.out.println("면색 :" + super.fillColor + ", 선색 :" + super.lineColor + ", 가로 :" + super.width + ", 세로 :"+ super.height + " 사각형을 그렸습니다.");		
		}
	}

	

	
	
	