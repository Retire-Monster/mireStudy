package com.java.dto;

public class FireEngine extends Car {

	protected int wheel = 10;
	protected int waterTank;
	
	@Override
	public void speedUp() {
//		super 는 바로 위 피상속 class 의 해당 메소드를 지칭함
//		super.speedUp();
		
//		상속 class 가 메소드를 재정의를 하면 해당 인스턴스의 피상속 class의 메소드 까지 재정의 한다.
		System.out.println("자식 : 속도업");
	}
	
	
}
