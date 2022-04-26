package com.javaex.ex14;

public class App {

	public static void main(String[] args) {

		Ractangle[] rackArray = new Ractangle[2];
		
		Ractangle rack1 = new Ractangle("빨강","검정",4,4);
		Ractangle rack2 = new Ractangle("주황","검정",5,5);
		
		rackArray[0] = rack1;
		rackArray[1] = rack2;
		
		rack1.draw();
		rack2.draw();
		
		Triangle[] triArray = new Triangle[2];
		
		Triangle tri1 = new Triangle("빨강","검정",4,4);
		Triangle tri2 = new Triangle("보라","검정",10,10);
		
		triArray[0] = tri1;
		triArray[1] = tri2;
		
		tri1.draw();
		tri2.draw();
		
		Circle[] cirArray = new Circle[2];
		
		Circle cir1 = new Circle("보라","빨강",3);
		Circle cir2 = new Circle("보라","검정",3);
		
		cirArray[0] = cir1;
		cirArray[1] = cir2;
		
		cir1.draw();
		cir2.draw();
		
	}

}
