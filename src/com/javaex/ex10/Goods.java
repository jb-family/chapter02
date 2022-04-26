package com.javaex.ex10;

public class Goods {
	
	
	//필드
	private String name;
	private int price;
	public static int count;	
	// static을 입력해주면 전역변수가 된다. 
	// 공유할 수 있게 되는 것
	// static을 입력하면 클래스명으로만 인식한다. Goods.count가 되는것
	// 왜냐하면 static을 최우선적으로 확인하기 때문 생성자가 만들어지기도 전에 확인함.
	// 그래서 Goods.count로 된다고 보면 된다. 즉 this.count = count + 1; 은
	// Goods.count가 + 1이됨 그래서 첫번째는 count 1 두번째는 2 세번째는 3이 됨.
	// public으로 놔야 GoodsApp에서 확인가능 private로 하면 getter나 setter 등으로 불러와야함. 
	
	
	//생성자
	public Goods() {
		this.count = count + 1;
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price; 
		this.count = count + 1;
	}
	

	//메소드 - gs
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
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
	
	
	//메소드 - 일반
	public void showinfo() {
		System.out.println("상품이름 : " + name);
		System.out.println("금액 : " + price);
		System.out.println("");
		
	}
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", count=" + count + "]";
	}
	
}
