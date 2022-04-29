package com.javaex.ex20;

import java.io.IOException;

public class MyFile {

   // constructor
   public MyFile() {

   }

   // method - g/s

   // method - general
   public String read(String path) {
      // path에 있는 파일을 읽어서 문자열 만들어준다.
      String result = "학교종이 떙땡땡 어서 모이자";
      return result;
   }

   public String read2(String path) {
      String result = "";
      /*
      try {
         // path에 있는 파일을 읽어서 문자열 만들어준다.
         // 파일이 없을때
         throw new IOException(); // 파일이 없는 상황을 강제로 발생
      } catch (IOException e) {
         System.out.println(path + " : file does not exist");
      } catch (NullPointerException n) {
         System.out.println(path + " 널포인트");
      } catch (ArithmeticException a) {
         System.out.println(path + " 0으로 나눌 수 없습니다");
      }
      */
      try {
         // path에 있는 파일을 읽어서 문자열 만들어준다.
         // 파일이 없을때
         throw new IOException();
      } catch (Exception e) {
         System.out.println(path+" : file does not exist");
      }
      
      return result;
   }
   
   //파일이 없는 경우 -- 사용하는쪽에 예외를 알리는 경우
   public String read3(String path) throws IOException { //내용에는 throw -> method 에는 throws!!
   
      String result = "";
      
      throw new IOException(); // 파일이 없는 상황을 강제로 발생
      
   }
}