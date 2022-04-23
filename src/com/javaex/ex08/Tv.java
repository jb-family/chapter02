package com.javaex.ex08;

public class Tv {
	
	//필드
	private int channel;
	private int volume;
	private boolean power;

	
	//생성자
	public Tv() {
	
	}
	
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	
	
	//메소드 - gs
	
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public boolean getPower() {
		return power;
	}
	
	
	
	//메소드 - 일반
	
	public void status() {
		System.out.println("채널 :" + channel + " 볼륨 : " + volume + " 전원상태 : " + power);
	}
	
	public void power(boolean on) {
		if(on == true) {
			this.power = true;
			System.out.println("전원이 켜졌습니다.");
		}else if(on == false) {
			this.power = false;
			if(this.power == false) {
				channel = 7;
				volume = 20;
			}
			System.out.println("전원이 꺼졌습니다.");
		}
	}
	
	public void channel (int channel) {
		if(power == true && channel > 0 && channel < 256) {
		if(channel > this.channel) {
			this.channel = channel;
		}
		else if(channel < this.channel) {
			this.channel = channel;
			}
		}else if (channel < 1 || channel > 255) {
			System.out.println("없는 채널입니다.");
		}
		else {
			System.out.println("Tv가 꺼져있어 조작할 수 없습니다.");
		}
		
	}
	
	public void channel (boolean up) {
		if(power == true) {
		if(up == true && channel > 255) {
			channel++;
		}else if(up == false && channel > 1) {
			channel--;
		}
		else {
			System.out.println("없는 채널입니다.");
		}
		}else {
			System.out.println("Tv가 꺼져있어 조작할 수 없습니다.");
		}
	}
	
	public void volume (int volume) {
		if(power == true) {
			if(volume > this.volume && volume <= 100) {
				this.volume = volume;
			}else if(volume < this.volume && volume >= 0) {
				this.volume = volume;
				if(volume == 0) {
					System.out.println("현재는 음소거상태입니다.");
				}
			}else if (volume == 0) {
				System.out.println("현재는 음소거상태입니다.");
			}
			else if (volume > 100) {
				this.volume = 100;
			}
		}
		else {
			System.out.println("Tv가 꺼져있어 조작할 수 없습니다.");
		}
	}
	
	public void volume (boolean up) {
		if(up == true && this.volume >= 0 && this.volume < 100) { 
			this.volume++;
		}
		else if(up == false && this.volume > 0 && this.volume <= 100) {
		this.volume--; 
		if(this.volume == 0) {
			System.out.println("현재는 음소거상태입니다.");
		}
		}
	}
	
	
	// 끝
	
	
}
