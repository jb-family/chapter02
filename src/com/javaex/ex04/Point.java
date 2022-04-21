package com.javaex.ex04;

public class Point {
	
	//필드
	private int x;
	private int y;
	//생성자
	
	//메소드 -gs
	public void setX(int n) {
		x = n;
	}
	
	public int getX() {
		return x;
	}
	
	
	public void setY(int p) {
		y = p;
	}
	
	public int getY() {
		return y;
	}
	
	
	
	//메소드 - 일반
	
	public void draw() {
		System.out.println("점[x=" + x + "," + "y=" + y + "]을 그렸습니다.");
	}
	
}
