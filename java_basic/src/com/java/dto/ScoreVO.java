package com.java.dto;

import java.util.Scanner;

public class ScoreVO implements Comparable<ScoreVO>{

	private String name;
	private int kor;
	private int eng;
	private int math;
	private int scien;

	public  int total() {
		return kor + eng + math + scien;
	}

	public float evg() {
		return ((int) (total() / 4f * 100 + 0.5)) / 100f;
	}

	public void input() {
		Scanner scann = new Scanner(System.in);

		System.out.print("이름 : ");
		name = scann.nextLine();

		System.out.print("국어 : ");
		kor = scann.nextInt();
		scann.nextLine();

		System.out.print("영어 : ");
		eng = scann.nextInt();
		scann.nextLine();

		System.out.print("수학 : ");
		math = scann.nextInt();
		scann.nextLine();

		System.out.print("과학 : ");
		scien = scann.nextInt();
		scann.nextLine();
	}
// 		모든 인스턴스가 동일한 값을 가져도 문제가 없는 함수는
//		'static'을 붙여서 타 클레스에서 인스턴스없이 가져올 수 있음
//	
	public static void printLabel() {
		System.out.println("이름\t국어\t영어\t수학\t과학\t총점\t평균");
	}

	public void printScore() {
		System.out.println(name +"\t"+kor+"\t"+eng+"\t"+math+"\t"+scien+"\t"+total()+"\t"+evg());
		
	}
//  이름을 기준으로 정렬(오름차순)
	@Override
	public int compareTo(ScoreVO other) {
		return this.name.compareTo(other.getName());
	//  (내림차순) other.name.compareTo(this.getName());
	}
//  토탈점수 오름차순 정렬을 위한것
//	public int compareTo(Object o) {
//		if ( !(o instanceof ScoreVO)) return -1;
//		
//		ScoreVO other = (ScoreVO)o;
//		return other.total() - this.total();
//	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getScien() {
		return scien;
	}
}
