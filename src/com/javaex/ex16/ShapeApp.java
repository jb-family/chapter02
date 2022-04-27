package com.javaex.ex16;

public class ShapeApp {

	public static void main(String[] args) {

		
	Shape s = new Shape("빨강","노랑"); 

	Recktangle r = new Recktangle("빨강", "검정", 5, 5);
	//System.out.println(r.getWidth());//자식의 메소드 사용가능
	
	
	Shape sr = new Recktangle("빨강", "검정", 5, 5);	
	// System.out.println(sr.getWidth());// 자식의 메소드를 사용할 수 없다.
	
	//섞어쓰기 Shape 로 Recktangle을 연결하면 Shape에 있는 클래스만 사용할수있음. 
	//Recktangle을 따라가면 Shape이 있다. 그런의미 메모리에는 올라가있지만 불러올때는 보이지않는다. 부모쪽만보인다.
	//Recktangle이지만 프로그램에서는 Shape인줄 안다고 생각하면 된다. 
		
	
	//Shape 배열에 모든 도형을 담아서 관리하고 싶을 때
	
	//Shape배열 생성
	
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
	
	System.out.println(sArray[0].toString());
	
	
	for(int i = 0; i < sArray.length; i++) {
		sArray[i].draw();
		System.out.println(sArray[i].area());
	}
	
	//입력하면 Recktangle의 값이나온다. sArray[0]은 r01이고 r01은 Shape만 볼수 있지만 값은 덮어서 쓰여져 Recktangle의 toString이 출력된다.
	//메소드 오버라이딩이 된다.
	//부모클래스에 draw() 메소드가 없으면 출력할수없다. 그래서 오버라이딩 할수가 없다. 그래서 부모클래스에 똑같은 이름의 메소드 draw()를 만들어 놓으면 
	//오버라이딩 되어 자식클래스의 draw()메소드가 출력된다.
	//안에 내용은 없어도 덮어쓰여 사용된다. ex) 부모클래스 draw() {빈값} 자식클래스 draw(String 등등) {출력내용 등등}
	//그러면 자식클래스 draw(String 등등) {출력내용 등등} 출력된다.
	//이렇게작성하면 도형들을 sArray로 하나로 담아 관리할수있게된다. (for문으로 다 출력할수있음 원래는 각각 다 출력해야함)
	//예를들어 도형이100가지라면 100가지 다 출력해야하는데 배열로 관리하면 한번만 for문으로 돌려서 사용이 가능하다.

	//오버라이딩은 Shape을 Triangle로 받았을때 즉 Shape만 보이게 해놨을때 메소드명을 똑같이 작성했을 때 덮여쓰여 출력되는것
	//Triangle  Triangle 인경우는 오버라이딩이 아니다. 그냥 재정의되는것.
	//재정의되는건 자식클래스에서 사용되는것이고 오버라이딩은 자식클래스에 있는 값이 부모클래스에 들어와서 덮여쓰여지는것. (오버라이딩은 부모클래스메소드가 사용되는거)

	//오버로딩은 똑같은 이름을 사용할수있는것 다만 매개변수의 타입과 순서가 다를때사용할수있다.
	//오버라이딩은 같은 이름의 메소드를 덮어쓰는것임 부모클래스와 자식클래스에서 같은 메소드명을 사용했을때사용가능하다. 
	//공통점은 같은이름을 사용되는거지만 기능은 완전히 다르다.
	
	
	//다운캐스팅 (부모클래스에만 보이는 상태에서( Shape r01 = new Recktangle() ) 자식클래스를 필요할때마다 보여줄수있는 기능)
	//((Recktangle)sArray[0]).getWidth() 
	//(Recktangle)sArray[0]을 사용하고 싶을 때엔 괄호를 사용해주어 먼저 형변환이 되게 해준다. 괄호가 없으면 getWidht()가 먼저 실행된다. 
	//강제형변환 되기전이라 (recktangle).sArra[0]으로 사용하면 아직 Shape으로 인식하기 때문에 getWidth를 불러올수없다.
	//강제 형변환시킨다 (메모리에 올려져있어야 사용이가능하다. 부모자식간의 관계여야 가능하다.)
	
	//업캐스팅
	//자식클래스가 부모클래스 타입으로 변환되는것 
	
	
	
	
	
	
	
	
	
	
	}

}
