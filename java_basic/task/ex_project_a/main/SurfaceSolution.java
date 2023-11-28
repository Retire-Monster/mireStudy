package ex_project_a.main;

import java.util.Scanner;

import ex_project_a.CircleVO;
import ex_project_a.RectangularVO;
import ex_project_a.TriangleVO;

public class SurfaceSolution {

	private TriangleVO triangleVO;
	private RectangularVO rectangularVO;
	private CircleVO circleVO;
	private int menu;

	public void input() {
		Scanner scann = new Scanner(System.in);
		System.out.println("도형을 선택하시오.");
		System.out.println("1.삼각형   2.사각형   3.원");
		menu = scann.nextInt();
		scann.nextLine();

		switch (menu) {
		case 1:
			triangleVO = new TriangleVO();
			System.out.print("밑변 : ");
			triangleVO.setBaseLine(scann.nextInt());
			scann.nextLine();
			System.out.print("높이 : ");
			triangleVO.setHeight(scann.nextInt()); 
			scann.nextLine();
			break;
		case 2:
			rectangularVO = new RectangularVO();
			System.out.print("가로 : ");
			rectangularVO.setGaro(scann.nextInt());
			scann.nextLine();
			System.out.print("세로 : ");
			rectangularVO.setSero(scann.nextInt());
			scann.nextLine();
			break;
		case 3:
			circleVO = new CircleVO();
			System.out.print("반지름 : ");
			circleVO.setRadius(scann.nextInt());
			scann.nextLine();
			break;
		default:
			System.out.println("입력이 올바르지 않습니다.");
			;
		}

	}

	public void process() {
		switch (menu) {
		case 1:
		case 2:
		case 3:
			break;
		default:
			System.out.println("프로그램을 종료합니다.");
			System.exit(0); // (비추천)(jvm을 끄는 기능임)강제종료 명령어
		}
	}

	public void output() {
		switch (menu) {
		case 1:
			System.out.println("삼각형의 넓이 : " + triangleVO.surface());
			break;
		case 2:
			System.out.println("사각형의 넓이 : " + rectangularVO.surface());
			break;
		case 3:
			System.out.println("원형 넓이 : " + circleVO.surface());
			break;
		default:
			;
		}
		System.out.println("계속하시려면 아무기나 누르시오");
		System.out.println("종료 : Q");
		String menu = new Scanner(System.in).nextLine();// 입력 인스턴스 (Scanner 를 1회만 사용함으로)
		if (menu.toUpperCase().equals("Q")) {
			System.exit(0); // (비추천)(jvm을 끄는 기능임)강제종료 명령어
		}
		// 이러한 불필요한 자료를 찾아 삭제하는 가비지컬렉터 라는 기능이 있음(메모리 환원)
		// 위와 같은 방식을 통해 메모리 할당을 방지할 수 있음
	}
}
