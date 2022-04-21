package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();	// Goods라는 틀에 주소값을 camera에 대입
		
		camera.name = "nikon";		// Goods안에 name은 틀만 가져온것 nikon은 카메라의 변수에서만 적용
		camera.price = 400000;		// Goods안에 price는 틀만 가져온것 nikon은 카메라의 변수에서만 적용
									// 틀안에 들어있는 값을 가져와서 사용하려면 변수뒤에.찍어주면 된다.
		
		System.out.println(camera.name);
		System.out.println(camera.price);
	}
}
