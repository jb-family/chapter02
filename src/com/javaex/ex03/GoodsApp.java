package com.javaex.ex03;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		
		Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setPrice(900000);
		
		
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		camera.showinfo();
		computer.showinfo();
		cup.showinfo();
		
		/*
		System.out.println("상품이름 :"+ camera.getName() + ", 가격 :" + camera.getPrice());
		System.out.println("상품이름 :"+ computer.getName() + ", 가격 :" + computer.getPrice());
		System.out.println("상품이름 :"+ cup.getName() + ", 가격 :" + cup.getPrice());
		*/
		
	}

}
