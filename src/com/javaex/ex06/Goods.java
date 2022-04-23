package com.javaex.ex06;

public class Goods {

	//필드
	
	private String name;
	private int price;
	
	//생성자
	public Goods() {	
		//	기본생성자(default 생성자라고도 불림 default 생성자는 생략가능)
		//	dafault생성자는 다른 생성자가 없으면 없어도 되지만
		//	다른 생성자를 만들면 default생성자가 없어져서 Goods cup = new Goods()
		//	사용하면 오류가난다.
		//	메모리에 데이터를 올리는일 <- 이게 생성자의 역할임 로직은 부가기능일뿐
		//	★★★★★★ 클래스를 인스턴스화 시키는 일 ★★★★★★ 중요함.
		System.out.println("Goods()");
	}
	
	public Goods(String name, int price) //(안에 변수이름은 아무렇게 지어줘도 됨) 
	{	//추가로직
		this.name = name;
		this.price = price;
		System.out.println("Goods(2)");
	}

	public Goods(String name) //(안에 변수이름은 아무렇게 지어줘도 됨) 
	{	//추가로직
		this.name = name;
		System.out.println("Goods(1)");
	}
	
	
	
	
	
	//메소드 - gs
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	
	
	//메소드 - 일반 html (2일)
	
	// 검사하는방법 (test용) 
	/*
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}	GoodsApp 에서 검사하려면 sysout 안에다 camera.toString() 넣어야함
	*/

	// 검사 후 제대로 된 양식으로 만듬
	public void showinfo() {
		System.out.println("상품이름 :" + name );
		System.out.println("가격 :" + price );
	}	// showinfo 출력하면 그냥 camera.showinfo() 하면 됨
}
