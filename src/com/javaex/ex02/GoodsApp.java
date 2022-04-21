package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		
		
		Goods camera = new Goods();
		Goods computer = new Goods();
		Goods cup = new Goods();
		
		camera.name = "니콘";
		camera.price = 400000;
		computer.name = "LG그램";
		computer.price = 900000;
		cup.name = "머그컵";
		cup.price = 2000;
		
		System.out.println("상품이름 : " + camera.name + "가격 :" + camera.price);
		System.out.println("상품이름 : " + computer.name + "가격 :" + computer.price);
		System.out.println("상품이름 : " + cup.name + "가격 :" + cup.price);
		
		//	new Goods 사용하면 Goods의 틀이 힙에다 메모리 복사됨 
		//	그리고 복사된 메모리를 저장하려고 변수명을 지정해준다. 스택에 변수저장값생김
	}	//	스택에 변수저장공간이 생기고 복사된 메모리를 연결하려면 변수명 앞에 참조변수의 값을 넣어줘야함 (Goods)
}		//	그래서 Goods camera = new Gdoos();가 됨 
		//	(참조변수연결)(변수명) = (힙에 Goods클래스 틀이 메모리에 복사됨)
