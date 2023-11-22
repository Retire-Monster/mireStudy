package java_basic;

import java.util.Scanner;

public class D004_05_For_PrimeNumber {

	public static void main(String[] args) {
//		정수를 입력받아 소수인지 확인하는 프로그램을 작성하시오
		
		//선언
		Scanner scann = new Scanner(System.in);
		int userInput = 0;
		boolean isSotsu = true;
		String result = "";
		
		//입력
		System.out.print("정수 입력 : ");
		userInput = scann.nextInt();
			
		//처리
		for(int i=2;i<userInput;i++) {
			if (userInput%i == 0) {
				isSotsu = false;
			}
		}
		if (isSotsu) {
		result += "솟수입니다.";
		} else {
			result += "솟수가 아닙니다.";
		}
		
		//출력
		System.out.println(result);
		
	}

}
