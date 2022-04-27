package com.javaex.ex15;

public class ShapeApp {

	public static void main(String[] args) {

		Racktangle[] rArray = new Racktangle[2];
		Circle[] cArray = new Circle[2];
		Triangle[] tArray = new Triangle[2];
		
		Shape s01 = new Shape("빨강", "노랑");
		s01.draw();
		
		Racktangle r01 = new Racktangle("빨강", "검정", 4, 6);
		Racktangle r02 = new Racktangle("파랑", "검정", 7, 7);
		
		rArray[0] = r01;
		rArray[1] = r02;
		
		r01.draw();	
		r02.draw();
		
		Circle c01 = new Circle("빨강", "노랑", 3);
		Circle c02 = new Circle("검정", "파랑", 5);
		
		cArray[0] = c01;
		cArray[1] = c02;
		
		c01.draw();
		c02.draw();
		
		
		Triangle t01 = new Triangle("검정", "빨강", 4, 7);
		Triangle t02 = new Triangle("노랑", "파랑", 6, 2);
		
		tArray[0] = t01;
		tArray[1] = t02;
		
		t01.draw();
		t02.draw();
		
		
		
	}

}
