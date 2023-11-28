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
//	FireEngine 는 car 과 형식이 같은가?
//	'car = new FireEngine();' 는 내부에 Car class (피상속클래스)외부에 FireEngine class (상속클래스)를 만든다
//	그러한 이유로 FireEngine 의 값은 가지고 올 수 있으나 Car class (피상속클래스)에 없는
//	FireEngine의 고유변수는 불러올 수 없다.

//	피상속 class 에서 메소드를 재정의 하면 상속받은 기존 class 의 메소드는 삭제된다
