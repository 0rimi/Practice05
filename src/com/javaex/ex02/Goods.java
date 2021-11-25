package com.javaex.ex02;

public class Goods {

	//필드
	private String name;
	private int price;

	
	//생성자
	//기본생성자가 없어서 낫던 오류 수정.
	public Goods() {
		
	}
	
	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	//메소드g/s
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	//메소드
	public void showinfo() {
		System.out.println("상품명 : "+ name + ", 가격: "+price);
	}
	
}




