package java_basic;

import java.util.Scanner;

public class D003_05_IfElse_OddEven {

	public static void main(String[] args) {
//		임의의 정수 하나를 입력받아 홀수 혹은 짝수인지를 판별하는 프로그램을 작성하시오
//		결과)
//		정수 하나를 입력하시오.
//		5
//		
//		입력한 정수 5는 홀수입니다.
//		
//		결과)
//		정수 하나를 입력하시오
//		
//		입력한 정수 4는 짝수입다.
//==================================================================================//
		Scanner scann = new Scanner(System.in);
		int userInput = 0;
		char txt = ' ';

		System.out.println("정수 한개를 입력하세요");
		userInput = scann.nextInt();

		if (userInput % 2 == 0) {
			txt = '짝';
		} else {
			txt = '홀';
		}
		System.out.println("입력한 정수 " + userInput + " (은)는 " + txt + "수 입니다.");
	}

}
