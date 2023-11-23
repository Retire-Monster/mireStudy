package java_basic;

import java.util.Scanner;

public class D005_01_while_Members {

	public static void main(String[] args) {
//		변수의 초기화시 아예 상관이 없는 값을 입력해 두기도 함		
		// 선언
		Scanner scann = new Scanner(System.in);
		String meun = "";
		String result = "";

		// 입력
//		
//		.equals() 함수는 문자열을 비교할 때 사용함
//		result.equals("문자") 와 같을 때 result의 값이 괄호 안의 값인
//		"문자" 와 같은지 판단하여 같으면 ture, 다르면 false 을 반환함
//		
		while (!meun.toUpperCase().equals("Q")) {
			System.out.println("1.회원가입  2.회원조회  3.회원수정  4.회원삭제");
			System.out.println("메뉴를 선택하세요.(종료 : Q)");
//		
//		사용자로부터 데이터를 주고받을때는 'String'
//		문자열로 주고받는것이 오류를 줄인다.
//		nextLine : 한줄 단위로 통째로 받아오는 것, String 타입임
//		
			meun = scann.nextLine();

			// 처리 및 출력
			result = "";
			switch (meun) {
			case "1":
				result = "회원가입..........\n\n";
				break;
			case "2":
				result = "회원조회..........\n\n";
				break;
			case "3":
				result = "회원수정..........\n\n";
				break;
			case "4":
				result = "회원삭제..........\n\n";
				break;
			case "q":
			case "Q":
				result = "프로그램을 종료합니다.\n\n";
				break;

			default:
				result = "메뉴선택이 올바르지 않습니다.\n\n";
			}
			// 출력
			System.out.println(result);
		}

	}

}
