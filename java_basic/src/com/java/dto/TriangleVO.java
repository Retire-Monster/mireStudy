package com.java.dto;

import java.util.Scanner;

public class TriangleVO extends Shape {

	private int height = 10;
	private int baseLine = 100;
	

	public TriangleVO() {
	}
	
	public TriangleVO(int height, int baseLine) {
		this.height = height;
		this.baseLine = baseLine;
	}
	
	public int surface() {
		return (int) (height * baseLine * 0.5f);
	}

	public static int surface(int height, int baseLine) {
		return (int) (height * baseLine * 0.5f);
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getBaseLine() {
		return baseLine;
	}

	public void setBaseLine(int baseLine) {
		this.baseLine = baseLine;
	}

	@Override
	public void inputData() {
		Scanner scann = new Scanner(System.in);
		
		System.out.print("πÿ∫Ø : ");
		this.baseLine = scann.nextInt();
		scann.nextLine();
		System.out.print("≥Ù¿Ã : ");
		this.height = scann.nextInt();
		scann.nextLine();
	}

	@Override
	public String outputMessage() {
		return "ªÔ∞¢«¸¿« ≥–¿Ã : ";
	}
	

	

}