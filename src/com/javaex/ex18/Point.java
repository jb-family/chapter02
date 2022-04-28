package com.javaex.ex18;

public class Point implements Drawable{

	//인터페이스를 구현하려고 한다면 implements를 입력해주면 된다.  
	//인터페이스에서 draw()가 있다면 메소드에서 draw()를 무조건 입력해주어야한다.
	//만약 인터페이스에서 100개있으면 100개 메소드 다 입력해줘야함.
	
	//필드
	private int x;
	private int y;
	
	
	//생성자
	public Point() {}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	//메소드 - gs
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	//메소드 - 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public void draw() {
		System.out.println("[x=" + x + ", y=" + y + "] 점을 그렸습니다.");
	}
	
	
	
	
	
}
