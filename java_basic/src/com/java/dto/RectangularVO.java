package com.java.dto;

import java.util.Scanner;

public class RectangularVO extends Shape {

	private int garo;
	private int sero;

//	클래스명과 동일한 것은 생성자로 봄으로 리턴타입을 작성하지 않는다.
	public RectangularVO() {
	}

	public RectangularVO(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
	}

	@Override
	public int surface() {
		return garo + sero;
	}

	public int getGaro() {
		return garo;
	}

	public void setGaro(int garo) {
		this.garo = garo;
	}

	public int getSero() {
		return sero;
	}

	public void setSero(int sero) {
		this.sero = sero;
	}

	@Override
	public void inputData() {
		Scanner scann = new Scanner(System.in);
		System.out.print("가로 : ");
		this.garo = scann.nextInt();
		scann.nextLine();
		System.out.print("세로 : ");
		this.sero = scann.nextInt();
		scann.nextLine();
	}

	@Override
	public String outputMessage() {
		return "사각형의 넓이 : ";

	}

}
