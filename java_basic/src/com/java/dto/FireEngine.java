package com.java.dto;

public class FireEngine extends Car {

	protected int wheel = 10;
	protected int waterTank;
	
	@Override
	public void speedUp() {
//		super �� �ٷ� �� �ǻ�� class �� �ش� �޼ҵ带 ��Ī��
//		super.speedUp();
		
//		��� class �� �޼ҵ带 �����Ǹ� �ϸ� �ش� �ν��Ͻ��� �ǻ�� class�� �޼ҵ� ���� ������ �Ѵ�.
		System.out.println("�ڽ� : �ӵ���");
	}
	
	
}
