package com.javaex.ex12;

public class Student extends Person{

	
	//필드
	private String schoolName;
	
	
	//생성자
	
	public Student() {
		super();
	}
	
	public Student(String schoolName) {
		super();
		this.schoolName = schoolName;
	}
	
	public Student(String name, int age, String schoolName) {
		super(name, age);	// super() 를 사용하면 매개변수의 값이 일치하면서 연결되어있는
							// 부모생성자를 불러올수있음.
							// this()는 자기생성자 super()는 부모생성자
		
		this.schoolName = schoolName;	// student 클래스꺼
	}


	//메소드 - gs
	
	public String getSchoolName() {
		return schoolName;
	}
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	
	
	//메소드 - 일반	
	
	
	// 부모와 자식의 메소드 이름이 같은경우
	// 부모쪽에서 메소드를 사용하고싶지않다면 자식쪽에서 메소드를 재정의한다. 오버라이딩아님.
	// 굳이 부모쪽에 있는데 다시 재정의하는이유는 부모쪽에있는걸 사용하지않기 위해서임
	
	// 부모를 상속받은 자식메소드에서 getName() 메소드를 사용하는 이유는 부모 클래스에서
	// 필드값이 private이라서 사용할수가 없다. 부모자식간에서도 private은 안된다.
	// 그래서 getName() getAge() 이렇게 넣는것이다.
	// 근데 getName() getAge()같이 부모클래스의 메소드는 명확하게 하기위해서 super.getName() super.getAge()로 사용하는게 좋다.
	// this.getName() this.getAge()도 되긴한다. 근데 super로 넣는게 제일 명확함.

	// 부모필드가 private라 자식이 부모클래스메소드를접근할때 getName() getAge()로 사용해야하는데
	// 자식한테는 접근을 허용하고 싶을때는 protected를 사용하면 된다.
	// 그러면 자식클래스에서 부모클래스처럼 getName() -> name으로 getAge() -> age 변경가능
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", " + "getName()=" + name 
		+ ", getAge()=" + age + "]";
		
	}
	 
	/*
	  public void showinfo() { 
	  System.out.println("*이름*: "+ super.name +", *나이*: "+
	  super.age + "*학교* : " + this.schoolName); }
	 */

	   public void showInfo() {
		   //부모 showInfo()그대로 사용
		   System.out.println(super.toString());
		   System.out.println("학교 : " + this.schoolName);
	   }
	   
	   
	
}
