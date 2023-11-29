package com.java.main;

import java.util.Scanner;

import com.java.dto.CircleVO;
import com.java.dto.RectangularVO;
import com.java.dto.Shape;
import com.java.dto.TriangleVO;
import com.java.ifc.Inputable;
import com.java.ifc.Outputable;

public class SurfaceSolution {

	private Shape s;
	private int menu;
	
	public void start() {
		do {
			input();
			process();
			output();
		} while (true);
	}

	protected void input() {
		Scanner scann = new Scanner(System.in);

		System.out.println("도형을 선택하시오.");
		System.out.println("1.삼각형   2.사각형   3.원");

		menu = scann.nextInt();
		scann.nextLine();

		Inputable inputObject = null;
		
		switch (menu) {
		case 1:
			inputObject = new TriangleVO();
			break;

		case 2:
			inputObject = new RectangularVO();
			break;

		case 3:
			inputObject = new CircleVO();

			break;
		default:
			System.out.println("입력이 올바르지 않습니다.");
			;
		}
//		아래 코드는 inputObject 오브젝트로 받은 레퍼런스 값을 
//		's' 즉 'Shape' 으로 적용하는 과정이다
		inputObject.input();
		s=(Shape)inputObject;
	}

	protected void process() {
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

	protected void output() {
		
		Outputable outObject = (Outputable)s;
		
		System.out.println(outObject.output() + s.surface());

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
