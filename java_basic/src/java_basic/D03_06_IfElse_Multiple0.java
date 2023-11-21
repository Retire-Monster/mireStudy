package java_basic;

import java.util.Scanner;

public class D03_06_IfElse_Multiple0 {

	public static void main(String[] args) {
//		입력한 정수가 2,3,5의 배수인지 판별하시오
		Scanner scann = new Scanner(System.in);
		int userInput = 0;
		int num = 0;
		boolean check = false ;
		
		System.out.println("정수 한개를 입력하세요");
		userInput = scann.nextInt();

		System.out.print("입력한 정수 " + userInput + " (은)는 ");
		if (userInput % 2 == 0) {
			check = true;
			num = 2;
			System.out.print(num);
		}
		if (num != 0) {
			System.out.print(", ");
		}
		num = 0;
		if (userInput % 3 == 0) {
			check = true;
			num = 3;
			System.out.print(num);
		}
		if (num != 0) {
			System.out.print(", ");
		}
		num = 0;
		if (userInput % 5 == 0) {
			check = true;
			num = 5;
			System.out.print(num);
		}
		if (check) {
			System.out.print("의 배수입니다.");
		} else {
			System.out.print("2,3,5 의 배수가 아닙니다.");
		}

	}

}
