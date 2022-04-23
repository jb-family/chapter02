package com.javaex.ex04;

public class Point {
	
	//필드
	private int x;
	private int y;
	
	//생성자
	
	
	public Point () {
		//default 생성자
	}
	
	public Point(int x, int y) {
		//메모리에 올리는 일
		this.x = x;
		this.y = y;
	}
	
	/*
	public Point(int x) {				// 생성자 타입의 순서가 같다면 구분안됨
		//메모리에 올리는 일
		this.x = x;
	}
	
	public Point (int y) {				// 생성자 타입의 순서가 같다면 구분안됨 
		//메모리에 올리는 일
		this.y = y;	
	}
	
	public Point(String a, int b) {	// 생성자는 타입의 순서도 본다. 구분가능
		
	}

	public Point(int b, String a) {	// 생성자는 타입의 순서도 본다. 구분가능
		
	}
	
	*/
	
	
	
	
	//메소드 -gs
	
	public int getX() {// private int x를 불러와서 밖으로 보내라 (반환(되돌려줘라)시켜라)
		return x;
	}
	
	
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	
	//메소드 - 일반
	
	public void draw() {
		System.out.println("점[x=" + x + "," + "y=" + y + "]을 그렸습니다.");
	}
	public void draw(boolean action) {	// 매개변수의 값이 달라지면 똑같은 이름의 메소드 사용가능 
		if(action == true) {
			System.out.println("점[x=" + x + "," + "y=" + y + "]을 그렸습니다.");
		}else {
			System.out.println("점[x=" + x + "," + "y=" + y + "]을 지워졌습니다.");
		}
	}
	
}
