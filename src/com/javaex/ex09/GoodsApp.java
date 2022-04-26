package com.javaex.ex09;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods("니콘", 400000);
		Goods computer = new Goods("LG그램", 900000);
		Goods cup = new Goods("머그컵", 2000);
		
		Goods[] goodsArray = new Goods[3];
		
		goodsArray[0] = camera;
		goodsArray[1] = computer;
		goodsArray[2] = cup;
		
		System.out.println(goodsArray[0].getName());
		System.out.println(goodsArray[2].getPrice());

		goodsArray[0].showinfo();
		goodsArray[1].showinfo();
		goodsArray[2].showinfo();
		System.out.println("==================");
		
		for(int i = 0; i < goodsArray.length; i++) {
			System.out.println(goodsArray[i]);
		}
		
		/*
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
		*/
	}
}
