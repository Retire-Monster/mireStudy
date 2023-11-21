package java_basic;

import java.util.Scanner;

public class D003_Q1_ScissorsRockPaper {

	public static void main(String[] args) {
//		랜덤변수와 조건문, 스캔함수를 활용하여 가위바위보 게임 만들기

		Scanner scann = new Scanner(System.in);
		double random = Math.random();
		int target = 0;
		int userInput = 0;
		boolean startBool;
		boolean winningBool;
		String Scissors = "가위";
		String Rock = "바위";
		String Paper = "보";
		String printCom = "";
		String printUser = "";

		System.out.println("가위 바위 보 게임입니다.");
//		target = (int) (random * 3);
		target = 2;
		System.out.println("컴퓨터는 값을 정했습니다");
		System.out.println("아래 표를 참고하여 정수를 입력해 컴퓨터를 이기십시오");
		System.out.println("가위 : 0 | 바위 : 1 | 보 : 2");
		userInput = scann.nextInt();

//				user	  com
//		이김	가위  3 > 보	2
//		이김	바위  1 > 가위	0
//		이김	보    2 > 바위	1
//		
//		짐		가위  0 < 바위	1
//		짐		바위  1 < 보	2
//		짐		보    2 < 가위	3

		startBool = ((userInput > 2) || (userInput < 0));

		if (startBool) {
			System.out.println("잘못된 값을 입력하였습니다.");
			System.out.println("프로그램을 종료합니다.");

		} else {
			if (target == 0) {
				printCom = Scissors;
			} else {
				if (target == 1) {
					printCom = Rock;
				} else {
					if (target == 2) {
						printCom = Paper;
					}
				}
			}
			if (userInput == 0) {
				printUser = Scissors;
			} else {
				if (userInput == 1) {
					printUser = Rock;
				} else {
					if (userInput == 2) {
						printUser = Paper;
					}
				}

				if ((target == 2) && (userInput == 0)) {
					userInput = 3;
				}

				winningBool = userInput > target;

				System.out.println("컴퓨터 값 : " + printCom + "\n내가낸 값 : " + printUser);
				if (target == userInput) {
					System.out.println("비겼습니다.");
				} else {
					if (winningBool) {
						if (userInput == 3) {
							userInput = 0;
						}
						System.out.println("이겼습니다.");

					} else {
						System.out.println("졌습니다.");
					}
				}
			}
		}
	}
}
