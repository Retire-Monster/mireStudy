package com.java.dto;

public abstract class Shape {
//	탬플릿패턴 만들기 - 추상클래스
//	추상 클래스는 인스턴스를 만들 수 없음

//	Shape 클래스를 상속받으면 아래 값을 가져간다.
	public final static String copyWriter = "제작자";
//  접근값 고정값 공유형 자료형	변수명	=	값

	public abstract void inputData();
	public abstract int surface();
	public abstract String outputMessage();
}
