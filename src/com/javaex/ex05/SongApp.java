package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {

	
	Song singer = new Song();
	Song singer1 = new Song();
	Song singer2 = new Song();
	
	singer.setTitle("좋은날");
	singer1.setTitle("거짓말");
	singer2.setTitle("벚꽃엔딩");
	
	singer.setArtist("아이유");
	singer1.setArtist("BIGBANG");
	singer2.setArtist("버스커버스커");
	
	singer.setAlbum("Real");
	singer1.setAlbum("Always");
	singer2.setAlbum("버스커버스커1집");
	
	singer.setComposer("이민수 작곡");
	singer1.setComposer("G-DRAGON 작곡");
	singer2.setComposer("장범준 작곡");
	
	singer.setYear(2010);
	singer1.setYear(2007);
	singer2.setYear(2012);
	
	singer.setTrack(3);
	singer1.setTrack(2);
	singer2.setTrack(4);
	
	// showinfo() 메소드 이용방법
	
	singer.showinfo();
	singer1.showinfo();
	singer2.showinfo();
	
	
	// getter와 setter 이용방법
	/*
	System.out.println(singer.getArtist() + ", " + singer.getTitle() + "( " + singer.getAlbum() + ", " + singer.getYear() + ", " + singer.getTrack() + "번 track, " + singer.getComposer() + " )");
	System.out.println(singer1.getArtist() + ", " + singer1.getTitle() + "( " + singer1.getAlbum() + ", " + singer1.getYear() + ", " + singer1.getTrack() + "번 track, " + singer1.getComposer() + " )");
	System.out.println(singer2.getArtist() + ", " + singer2.getTitle() + " (" + singer2.getAlbum() + ", " + singer2.getYear() + ", " + singer2.getTrack() + "번 track, " + singer2.getComposer() + " )");
	*/
	
	
	}
}
