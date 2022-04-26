package com.javaex.ex12;

public class PersonApp {

   public static void main(String[] args) {
	  /*
      Person p01 = new Person("정우성", 45);
      p01.showInfo();
      
      Student s01 = new Student("서울고등학교");
      System.out.println(s01.toString());
      
      
      Student s02 = new Student();	// 새로운 인스턴스화하여 부모요소의(Person class) setter 이용
      s02.setAge(70);
      s02.setName("정지웅");
      s02.setSchoolName("용인초등학교");
      
      System.out.println(s02.toString());
      Student s03 = new Student("서울고등학교");
      System.out.println(s03.toString());
      */
      // 자식이 레퍼런스를 호출할 때 부모의 인스턴스가 작동한다. 기본값은 기본생성자 불러옴 default생성자
      // 자식생성자가 부모생성자를 불러온다
      // 시작은 자식생성자가 불러오려고 하다가 extends 부모클래스를 보면 부모생성자를 작동하고 생성하고
      // 자식 생성자가 마저 생성된다.
      
	   Student s03 = new Student("황일영", 70, "서울고등학교");
//	   System.out.println(s03.toString()); 
	   
	   s03.showInfo();
	   
	   
	   
	   
	   
	   
   }

}