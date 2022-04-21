package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {

		Point x = new Point();
		Point y = new Point();
		
		x.setX(5);
		x.setY(5);
		
		y.setX(10);
		y.setY(23);
		
		
		// draw()메소드 이용방법
		
		x.draw();
		y.draw();
		
		// getter와 setter 이용방법
		/*
		System.out.println("점[x=" + x.getX() + "," + "y=" + x.getY() + "]을 그렸습니다.");
		System.out.println("점[x=" + y.getX() + "," + "y=" + y.getY() + "]을 그렸습니다.");
		*/
		
	}
}
