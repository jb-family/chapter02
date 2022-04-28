package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
				
		/*
		//인터페이스도 레퍼런스타입과 객체를 다르게 입력이 가능하다.
		
		
		Point p01 = new Point(4, 4);
		Drawable p02 = new Point(100,100);
		p01.draw();
		p02.draw();
		//p02.getX(); 입력하면 오류가난다. 
		//Point는 인터페이스 Drawable로 가려지기때문에 draw()밖에 못보는것이다. 
		//근데 draw()메소드의 이름이 같아서 Point클래스의 draw()메소드가 불러와지는것
		//이것은 오버라이딩이 아니다. 상속이아님.

		
		System.out.println("==============================");
		Shape r01 = new Recktangle("빨강", "검정", 5, 5);
		r01.area();
		//r01.draw(); Shape클래스는 draw()를 볼수없다. draw()는 인터페이스에 있다. 
		Drawable r02 = new Recktangle("빨강", "검정", 5, 5);
		r02.draw();
		//r02.area(); Drawable인터페이스는 draw()밖에 없기떄문에 area를 읽을수 없다.
		//Drawable r02 = new Recktangle 는 Recktangle을 메모리에 올려놨지만 Drawable안에 있는 메소드만 보임.
	
		*/
		
		
		
		
		//배열선언
		Drawable[] dArray = new Drawable[4];
		
		
		Drawable r01 = new Recktangle("빨강", "검정", 1, 1);
		Drawable c01 = new Circle("파랑", "검정", 3);
		Drawable t01 = new Triangle("주황", "검정", 5, 5);
		Drawable p01 = new Point(8,8);
		
		dArray[0] = r01;
		dArray[1] = c01;
		dArray[2] = t01;
		dArray[3] = p01;
		
		for(int i = 0; i < dArray.length; i++) {
			dArray[i].draw();
		}
		
		//사각형의 가로값을 가져오기 (강제형변환해주기)
		System.out.println(((Recktangle)dArray[0]).getWidth());
		
		//사각형의 면의 색 구하기
		System.out.println(((Shape)dArray[0]).getFillColor());
		
		System.out.println("==========================");
		System.out.println("배열을 통해서 면적 구하기");
		
		for(int i = 0; i < dArray.length; i++) {
			//System.out.println(dArray[i] instanceof Shape);
			
			if(dArray[i] instanceof Shape) {
				System.out.println(((Shape)dArray[i]).area());
			}
			
			
			//double area = ((Shape)dArray[i]).area();
			//System.out.println(area);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
 