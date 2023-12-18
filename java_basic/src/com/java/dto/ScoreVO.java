package com.java.dto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ScoreVO implements Comparable<ScoreVO> {

	private String stuNum;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int scien;
	private Date regDate;

	public String getStuNum() {
		return stuNum;
	}

	public Date getRegDate() {
		return regDate;
	}

	public int total() {
		return kor + eng + math + scien;
	}

	public float evg() {
		return ((int) (total() / 4f * 100 + 0.5)) / 100f;
	}

	public void input() {
		Scanner scann = new Scanner(System.in);

		System.out.print("학번 : ");
		stuNum = scann.nextLine();

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

		regDate = new Date();
	}

// 		모든 인스턴스가 동일한 값을 가져도 문제가 없는 함수는
//		'static'을 붙여서 타 클레스에서 인스턴스없이 가져올 수 있음
//	
	public static void printLabel() {
		System.out.println("학번\t이름\t국어\t영어\t수학\t과학\t총점\t평균\t등록일");
	}

	public void printScore() {

		SimpleDateFormat stdformat = new SimpleDateFormat("yyyy-mm-dd");

		String regDate = stdformat.format(this.regDate);
		String today = stdformat.format(new Date());

		if (regDate.contentEquals(today)) {
			regDate = new SimpleDateFormat("HH:mm:ss").format(this.regDate);
		}

		System.out.println(stuNum + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + scien + "\t" + total()
				+ "\t" + evg() + "\t" + regDate);

	}

	@Override
	public int hashCode() {
		return stuNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ScoreVO) {
			ScoreVO other = (ScoreVO)obj;
			return other.stuNum.equals(stuNum);
		} else {
			return false;
		}

	}

	// 이름을 기준으로 정렬(오름차순)
	@Override
	public int compareTo(ScoreVO other) {
		if (this.stuNum.equals(other.stuNum)) {
			return 0;
		} else {
			return other.getRegDate().compareTo(this.regDate);
//		return this.name.compareTo(other.getName());
//		 other.name.compareTo(this.getName()); // (내림차순)
		}
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
