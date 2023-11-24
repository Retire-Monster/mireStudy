package java_basic;

import java.util.Scanner;

public class D005_Q1_Lottery {

	public static void main(String[] args) {
//======================2023.11.23======================//
//		로또 프로그램을 작성하시오						//
//		(1부터 45 사이의 임의의 숫자 6개)				//
//														//
//		실행)					실행)					//
//		금액을 입력 : 1000		금액을 입력  : 3200		//
//		34 23 22 21 11 2		22 33 21 20 11 2		//
//								43 23 11 19 18 7		//
//								27 12 13 16 34 15		//
//								거스름돈 : ￦200		//
//======================================================//

		// 선언
		Scanner scann = new Scanner(System.in);

		int userInput = 0;
		int money = 0;
		int lotterNum = 0;
		int target = 0;
		double random = Math.random();
		boolean change = false;
		String lotteryOutput = "";
		int[] lotteryData = new int[45];

		// 입력
		System.out.print("금액을 입력 : ");
		userInput = scann.nextInt();
		scann.nextLine();
		// 처리
		for (int i = 0; i < 45; i++) {
			lotteryData[i] = (i+1);
		}

		for (int i = 0; i < 6; i++) {
			target = (int) (random * 44);
			lotteryData[i] = lotterNum;
			lotteryData[target] = lotteryData[i];
			lotteryData[target] = lotterNum;
			System.out.println(lotteryOutput);
		}
		
		for (int i = 0; i < 6; i++) {
			lotteryOutput += lotteryData[i];
		}
		
		// 출력
		System.out.println(lotteryOutput);
		if (money>0) {
			System.out.println("거스름돈 : ￦" + money);
		}

	}

}
