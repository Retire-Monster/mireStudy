package com.java.main;

import java.util.Scanner;

import com.java.dto.ScoreVO;

public class ScoreMG {
	public static void main(String[] args) {
		
		//선언
		Scanner scann = new Scanner(System.in);
		final int STUDEN_NUM;
		
		//입력
		System.out.print("학생 수 : ");
		STUDEN_NUM = scann.nextInt(); scann.nextLine();
//		아래 명령어는
//		ScoreVO의 인스턴스 4개를 만든것이 아니라
//		인스턴스의 주소를 지칭할 수 있는 배열을 만든것으로
//		인스턴스의 주소를 별도로 지정해야 한다.
//		인스턴스의 주소를 별도로 지정하는 방법은 아래 반복문의
//		scores[i] = new ScoreVO(); 와 같다.
		ScoreVO[] scores = new ScoreVO[STUDEN_NUM];
		
		for(int i=0;i<STUDEN_NUM;i++) {
			scores[i] = new ScoreVO();
			scores[i].input();
		}	
		
		//출력
		System.out.print("순번\t");
		ScoreVO.printLabel();
		for (int i = 0 ;i<STUDEN_NUM;i++) {
			System.out.print((i+1)+"\t");
			scores[i].printScore();
		}
		
		
	}
}
