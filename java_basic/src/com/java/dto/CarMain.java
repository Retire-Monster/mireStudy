package com.java.dto;

public class CarMain {

	public static void main(String[] args) {

		Car car = new Car();
		car = new Car();
		car.speedUp();
		car.speedDown();
		System.out.println(car.wheel);
		
		System.out.println("==========================================");
		
		FireEngine fireCar = new FireEngine();
		car = fireCar;

		car.speedUp();
		car.speedDown();
		System.out.println(car.wheel);
		System.out.println(((FireEngine)car).wheel);
		
	}
}
//	FireEngine �� car �� ������ ������?
//	'car = new FireEngine();' �� ���ο� Car class (�ǻ��Ŭ����)�ܺο� FireEngine class (���Ŭ����)�� �����
//	�׷��� ������ FireEngine �� ���� ������ �� �� ������ Car class (�ǻ��Ŭ����)�� ����
//	FireEngine�� ���������� �ҷ��� �� ����.

//	�ǻ�� class ���� �޼ҵ带 ������ �ϸ� ��ӹ��� ���� class �� �޼ҵ�� �����ȴ�
