package com.javaex.ex06;

public class GoodsApp {

	public static void main(String[] args) {
		//	setName과 setPrice를 일일히 입력하지 않고 메모리를 바로 올리면서 
		//	setName과 setPrice가 올라갈 수 있도록 하고싶을 때 생성자를 이용하면 된다.
		
		//	생성자를 이용해서 setName과 setPrice를 인스턴스화하면서 바로 출력하게 하고싶을 때
		//	Goods 클래스에 생성자안에 { } 추가로직을 넣으면 아래처럼 입력이 된다.
		//	Goods 생성자 안에 ()인자 값이 있으면 Goods 클래스안에 생성자를 찾는데
		//	인자의 타입과 개수가 맞는걸 찾으면 추가로직을 입력한 생성자가 실행된다.
		//	생성자는 한번만 사용되고 메모리에서 사라진다.( 한번만 사용된다는 것은 
		//	Goods computer 에서를 말한다. )
			
			Goods computer = new Goods("LG그램",900000);	 
			Goods camera = new Goods("니콘");
			Goods cup = new Goods();
			
		/*
		Goods computer = new Goods();	 
		computer.setName("LG그램");
		computer.setPrice(900000);
		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		camera.showinfo();
		computer.showinfo();
		cup.showinfo();
		*/
	}
}
