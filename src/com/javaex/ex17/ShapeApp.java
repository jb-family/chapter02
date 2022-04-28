package com.javaex.ex17;


public class ShapeApp {

	public static void main(String[] args) {

				
		//Shape 추상클래스는 메모리에 올라가면 안됨
		//Shape s = new Shape("빨강", "검정"); 
		//추상클래스와 추상메소드로 해놓는 이유는 불필요한 코드를 줄이기 위해서임.
		//추상클래스,메소드로 정의하면 자식의 경우 메소드를 무조건 다 써줘야한다.
		//안해주면 오류가 남. 즉 추상클래스안에 있는 추상메소드들은 자식클래스에서 모두 사용해야함
		


		 
	
	
		Recktangle r = new Recktangle("빨강", "검정", 5, 5);
		//System.out.println(r.getWidth());//자식의 메소드 사용가능
		
		
		Shape sr = new Recktangle("빨강", "검정", 5, 5);	
		
		
		Shape[] sArray = new Shape[6];
		
		//사각형 2개 
		Shape r01 = new Recktangle("빨강", "검정", 4, 4);
		Shape r02 = new Recktangle("주황", "검정", 5, 5);
		
		//원 2개
		Shape c01 = new Circle("노랑", "검정", 6);
		Shape c02 = new Circle("초록", "검정", 6);
		
		//삼각형 2개
		Shape t01 = new Triangle("파랑", "검정", 8, 8);
		Shape t02 = new Triangle("남색", "검정", 9, 9);
		
		sArray[0] = r01;
		sArray[1] = r02;
		sArray[2] = c01;
		sArray[3] = c02; 
		sArray[4] = t01;
		sArray[5] = t02;
		
		
		for(int i = 0; i < sArray.length; i++) {
			sArray[i].draw();
		System.out.println(	sArray[i].area());
		}
	}

}
