package com.javaex.ex08;

public class TvApp {

	public static void main(String[] args) {

		Tv tv = new Tv(7, 20, false);
		tv.status();		// 초기 값
		
		System.out.println();
		System.out.println("=========볼륨 테스트=======");
		System.out.println();
		tv.volume(100);		// 볼륨 100 설정
		tv.status();		// tv 꺼진상태 조작불가
		
		System.out.println();
		System.out.println("========채널 테스트========");
		System.out.println();
		tv.channel(100);	// 채널 100 설정
		tv.status();		// tv 꺼진상태 조작불가
		
		System.out.println();
		System.out.println("========전원테스트========");
		System.out.println();
		tv.power(true);		// tv 전원 on
		tv.status();		// tv 켜진상태 조작가능
		
		System.out.println();
		System.out.println("=========채널테스트========");
		System.out.println();
		
		tv.channel(1);		// tv 채널7 -> 1이동
		tv.status();		// tv 채널 1
		tv.channel(0);		// tv 채널 1 -> 0이동
		tv.status();		// tv 채널이동불가
		tv.channel(255);	// tv 채널 1 -> 255이동
		tv.status();		// tv 채널 255
		tv.channel(256);	// tv 채널 255 -> 256이동
		tv.status();		// tv 채널이동불가
		tv.channel(true);	// 채널 1증가
		tv.status();		// tv 채널이동불가
		tv.channel(1);		// tv 채널 255 -> 1이동
		tv.status();		// 채널 1
		tv.channel(false);	// 채널 1감소
		tv.status();		// tv 채널이동불가
		
		System.out.println("==========볼륨테스트=========");
		tv.volume(50);		// 볼륨 20 -> 50증가
		tv.status();		// 볼륨 50
		tv.volume(101);		// 볼륨 50 -> 101이동 (100으로 조정)
		tv.status();		// tv 볼륨증가불가
		tv.volume(1);		// 볼륨 100 -> 1이동
		tv.status();		// 볼륨 1
		tv.volume(0);		// 볼륨 1 -> 0이동
		tv.status();		// 볼륨 0 음소거상태
		tv.volume(120);		// 볼륨 1 -> 120이동
		tv.status();		// 볼륨 100으로 조정
		tv.volume(true);	// 볼륨 100 -> 101증가 (100으로 조정)
		tv.status();		// tv 볼륨증가불가 
		tv.volume(1);		// tv볼륨 100 -> 1감소
		tv.status();		// 볼륨 1
		tv.volume(false);	// 볼륨 1 -> 0감소
		tv.status();
		
		System.out.println("==========전원테스트==========");
		tv.power(false);
		tv.status();
		
		
		
		
		
		
		
		
		
	}
}
