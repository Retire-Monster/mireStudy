package com.java.dto;

public class Car {
//	'protected'같은 클래스와 상속 클래스에서만 사용이 가능함
	protected int wheel=4;
	protected int breakk=4;
	protected int aecll=4;
	
	public void speedUp() {
		System.out.println("부모 : 속도업");
	};
	public void speedDown() {
		System.out.println("부모 : 속도다운");
	};	
	
}
