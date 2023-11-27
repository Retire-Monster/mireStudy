package project_a.main;

import java.util.Scanner;

import project_a.ForCircleVO;
import project_a.ForTetragonVO;
import project_a.ForTriangleVO;

public class UserInterfaceVO {

	static void start() {
		System.out.println("삼각형, 사각형, 원형의 넓이를 구하는 프로그램입니다.");
		System.out.println("원하시는 도형을 선택해주세요");
	}
	static void inputWait() {
		System.out.println("1:삼각형\t2:사각형\t3:원형\t\tQ:종료");
		System.out.println("입력 :");
	}

	static void bar() {
		System.out.println("======================================================");
	}

	public void userStartOrder() {
		String order = "";
		Scanner scann = new Scanner(System.in);

		do {
			order = scann.nextLine();
			switch (order) {
			case "1":
				ForTriangleVO ForTriangleVO = new ForTriangleVO();
				ForTriangleVO.UserInput();
				break;
			case "2":
				System.out.println("사각형의 넓이를 구합니다");
				ForTetragonVO ForTetragonVO = new ForTetragonVO();
				ForTetragonVO.UserInput();

				break;
			case "3":
				System.out.println("원형의 넓이를 구합니다");
				ForCircleVO ForCircleVO = new ForCircleVO();
				ForCircleVO.UserInput();

				break;
			case "q":
			case "Q":
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 값을 입력함\n다시 입력하시오");
				order = " ";
			}
		} while (order == " ");
	}

	public void userReStartOrder() {
		String order = "";
		Scanner scann = new Scanner(System.in);
		bar();
		System.out.println("계속 하시려면 아무키나 입력하세요.");
		System.out.println("Q:종료");
		order = scann.nextLine();
		switch (order) {
		case "q":
		case "Q":
			bar();
			System.out.println("프로그램을 종료합니다.");
			bar();
			break;
		default:
			bar();
			inputWait();
			bar();
			userStartOrder();
		}

	}

}
