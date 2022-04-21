package com.javaex.ex03;

public class Goods {

	
	// 필드
	private String name;
	private int price;
	
	
	// 생성자
	
	// 메소드 - gs
	public void setName(String n) {	// void를 사용할때엔 ..
		name = n;	// 필드의 String name으로 n값이 들어간다는 의미. 
	}				// 메소드에서 n값을 name에 넣었다고 필드의 name 값이 바뀌는게 아니다.
					// Goods 틀을 가져온것이기 때문에 Goods camera의 주소를 가진 name의 값이 바뀌는것이다.
	public void setPrice(int p) {
		price = p;
	}
	
	public String getName() {
		return name;	// return name의 뜻은 name을 main() getName에다 보낸다는 의미
	}
	
	public int getPrice() {
		return price;	// 400000의 값을 받고 다시 name 값은 리턴(반환)된다. camera예시임
	}
	
	// 메소드 - 일반

	public void showinfo() {
		System.out.println("상품이름 :" + name );
		System.out.println("가격 :" + price );
	}

	
}

