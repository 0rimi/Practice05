package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member jws = new Member();
		jws.setName("정우성");
		jws.setId("jws");
		jws.setPoint(50000);
		jws.showinfo();
		
		Member yjs = new Member();
		yjs.setName("유재석");
		yjs.setId("yjs");
		yjs.setPoint(30000);
		yjs.showinfo();
		
		Member lhr = new Member();
		lhr.setName("이효리");
		lhr.setId("lhr");
		lhr.setPoint(4000);
		lhr.showinfo();
		
	}

}
