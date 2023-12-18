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

		System.out.print("�й� : ");
		stuNum = scann.nextLine();

		System.out.print("�̸� : ");
		name = scann.nextLine();

		System.out.print("���� : ");
		kor = scann.nextInt();
		scann.nextLine();

		System.out.print("���� : ");
		eng = scann.nextInt();
		scann.nextLine();

		System.out.print("���� : ");
		math = scann.nextInt();
		scann.nextLine();

		System.out.print("���� : ");
		scien = scann.nextInt();
		scann.nextLine();

		regDate = new Date();
	}

// 		��� �ν��Ͻ��� ������ ���� ������ ������ ���� �Լ���
//		'static'�� �ٿ��� Ÿ Ŭ�������� �ν��Ͻ����� ������ �� ����
//	
	public static void printLabel() {
		System.out.println("�й�\t�̸�\t����\t����\t����\t����\t����\t���\t�����");
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

	// �̸��� �������� ����(��������)
	@Override
	public int compareTo(ScoreVO other) {
		if (this.stuNum.equals(other.stuNum)) {
			return 0;
		} else {
			return other.getRegDate().compareTo(this.regDate);
//		return this.name.compareTo(other.getName());
//		 other.name.compareTo(this.getName()); // (��������)
		}
	}
//  ��Ż���� �������� ������ ���Ѱ�
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
