package com.java.main;

import java.util.Scanner;

import com.java.dto.ScoreVO;

public class ScoreMG {
	public static void main(String[] args) {
		
		//����
		Scanner scann = new Scanner(System.in);
		final int STUDEN_NUM;
		
		//�Է�
		System.out.print("�л� �� : ");
		STUDEN_NUM = scann.nextInt(); scann.nextLine();
//		�Ʒ� ��ɾ��
//		ScoreVO�� �ν��Ͻ� 4���� ������� �ƴ϶�
//		�ν��Ͻ��� �ּҸ� ��Ī�� �� �ִ� �迭�� ���������
//		�ν��Ͻ��� �ּҸ� ������ �����ؾ� �Ѵ�.
//		�ν��Ͻ��� �ּҸ� ������ �����ϴ� ����� �Ʒ� �ݺ�����
//		scores[i] = new ScoreVO(); �� ����.
		ScoreVO[] scores = new ScoreVO[STUDEN_NUM];
		
		for(int i=0;i<STUDEN_NUM;i++) {
			scores[i] = new ScoreVO();
			scores[i].input();
		}	
		
		//���
		System.out.print("����\t");
		ScoreVO.printLabel();
		for (int i = 0 ;i<STUDEN_NUM;i++) {
			System.out.print((i+1)+"\t");
			scores[i].printScore();
		}
		
		
	}
}
