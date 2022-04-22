package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {

		Point p1 = new Point();
		
		p1.setX(5);
		p1.setY(5);
		
		Point p2 = new Point();
		p2.setX(10);
		p2.setY(23);
		
		
		Point p3 = new Point(10, 20);
		
		// 생성자에 x값 넣고 y값을 setY로 출력
		/*
		Point p4 = new Point(100);	
		p4.setY(200);
		
		
		//y값을 먼저 넣고
		//setter로 x값을 넣는 방식
		Point p5 = new Point(2000);
		p5.setX(1000);
		
		*/
		
		// draw()메소드 이용방법
		
		p1.draw();
		p2.draw();
		p3.draw();
		
		p1.draw(true);	// 그리기
		p1.draw(false);	// 지우기
		
		// getter와 setter 이용방법
		/*
		System.out.println("점[x=" + x.getX() + "," + "y=" + x.getY() + "]을 그렸습니다.");
		System.out.println("점[x=" + y.getX() + "," + "y=" + y.getY() + "]을 그렸습니다.");
		*/
		
	}
}
