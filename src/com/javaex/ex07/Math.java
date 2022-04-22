package com.javaex.ex07;

public class Math {

	
	//	필드
	
	
	//	생성자
	//	디폴트 메소드 public Math() { };
	
	
	//	메소드 - gs
	
	
	//	메소드 - 일반
	//	메소드도 오버로딩 가능하다.  
	//	메소드 오버로딩은 매개변수의 개수나 타입, 순서가 다르면 메소드는 중복사용이 가능하다. 
	//	생성자 오버로딩과 같음
	public int plus(int a, int b) {	// 정수 + 정수
		return a + b;
	}
	
	public double plus(double a, int b) {	// 실수 + 정수
		return a + b;
	}
	
	public double plus(int a, double b) {	// 정수 + 실수
		return a + b;
	}
	
	public double plus(double a, double b) {	// 실수 + 실수
		return a + b;
	}
	
	
	
	
}
