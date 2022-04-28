package com.javaex.ex18;

public abstract class Shape {
	//필드
	protected String fillColor;
	protected String lineColor;
	
	//생성자
	public Shape() {}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	//메소드 - gs
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	//메소드 - 일반
	
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	
	//public abstract void draw(); 
	// draw()를 주석처리한 이유는 point라는 클래스는 draw()기능만 필요하기 때문. 
	// 왜냐하면 draw()추상메소드가 있으면 point도 draw() area() 가 모두 필요해짐.
	// draw()가 없으면 자식클래스에서 draw()가 있어도 오류가 안남.
	// 자식클래스는 상속을 1개밖에 받지 못함. 그래서 point때문에 darw()가 들어가는 인터페이스를
	// 만들어 공통으로 draw()를 넣어준다.
	// 인터페이스는 무조건 제목만 입력할수있고 내용을 입력할수없음. 
	// ppt 68번그림 참고하기
	
	//public abstract double draw(); 
	
	public abstract double area(); 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
