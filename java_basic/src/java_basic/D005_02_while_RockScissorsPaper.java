package java_basic;

import java.util.Scanner;

public class D005_02_while_RockScissorsPaper {

	public static void main(String[] args) {

		// 전역변수 선언
		Scanner scann = new Scanner(System.in);
		
		String com_kwb = ""; // 가위 0, 바위 1, 보 2
		int com_kwb_num = 0;

		String my_kwb = ""; // 가위 0, 바위 1, 보 2
		int my_kwb_num = 0;

		int menu = 0;
		String juge = "";

		String quti = "";

		// 입력
		while (!quti.toUpperCase().equals("Q")) {

			com_kwb_num = (int) Math.random() * 3;

			System.out.println("컴퓨터는 결정했습니다.");
			System.out.println("당신의 선택은?");
			System.out.println("1.가위 2.바위 3.보");

			while (true) {
				menu = scann.nextInt();
				scann.nextLine();
//				
//				nextInt 이후 scann.nextLine(); 를 함으로써
//				menu 에 정수를 넣기위해 입력되고 남은 \n 문자를 삭제한다
//				이를 통해 입력에 대한 오동작을 막는다.
//				

				if (menu < 1 || menu > 3) {
					System.out.println("입력이 올바르지 않습니다.");
				} else {
					break;
				}
			}

			my_kwb_num = menu - 1;

			// 처리
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
			System.out.println();
			System.out.println("더 할거에요?(그만 : Q)");
			System.out.println("계속하려면 아무키나 누르세요");
			quti = scann.nextLine();

		}
		System.out.println("================================");
		System.out.println("가위바위보 프로그램을 종료합니다");
		System.out.println("================================");
	}

}
