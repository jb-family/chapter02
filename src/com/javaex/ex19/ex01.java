package com.javaex.ex19;

import java.io.IOException;
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {

		double result;
		int num;
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		try {
			result = 100 / num;	
			
			System.out.println(result);
			
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		}finally {
			System.out.println("finally영역");
		}
		
		//
		
		
		
		
		
		
		sc.close();
	}

}
