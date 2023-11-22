package java_basic;

import java.util.Scanner;

public class D004_02_Switch_ScissorsRockPaper {

	public static void main(String[] args) {
//		랜덤변수와 조건문, 스캔함수를 활용하여 가위바위보 게임 만들기

		String com_kwb = ""; // 가위 0, 바위 1, 보 2
		int com_kwb_num = 0;

		String my_kwb = ""; // 가위 0, 바위 1, 보 2
		int my_kwb_num = 0;

		int menu = 0;
		String juge = "";

		// 입력
		com_kwb_num = (int) Math.random() * 3;

		System.out.println("컴퓨터는 결정했습니다.");
		System.out.println("당신의 선택은?");
		System.out.println("1.가위 2.바위 3.보");

		Scanner scann = new Scanner(System.in);
		menu = scann.nextInt();
		my_kwb_num = menu - 1;

		if (com_kwb_num == (my_kwb_num + 1) % 3) {
			juge = "졌습니다.";
		} else if (com_kwb_num == my_kwb_num) {
			juge = "비겼습니다.";
		} else {
			juge = "이겼습니다.";
		}

		switch (my_kwb_num) {
		case 0:
			my_kwb = "가위";
			break;
		case 1:
			my_kwb = "바위";
			break;
		default:
			my_kwb = "보";
		}

		switch (com_kwb_num) {
		case 0:
			com_kwb = "가위";
			break;
		case 1:
			com_kwb = "바위";
			break;
		default:
			com_kwb = "보";
		}

		// 출력
		System.out.println("컴퓨터 : " + com_kwb);
		System.out.println("당신 : " + my_kwb);
		System.out.println(juge);
	}
}