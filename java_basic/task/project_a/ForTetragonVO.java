package project_a;

import java.util.Scanner;

public class ForTetragonVO {

	public int baseLine = 0;
	public int high = 0;
	public int answer = 0;
	
	public void UserInput() {
	Scanner scann = new Scanner(System.in);
	System.out.println("==========================");
	System.out.println("사각형의 넓이를 구합니다");
	System.out.println("가로 x 세로 = 넓이");
	System.out.println("==========================");
	System.out.print("가로 : ");
	baseLine = scann.nextInt(); scann.nextLine();
	System.out.print("세로 : ");
	high = scann.nextInt(); scann.nextLine();
	answer = baseLine*high;
	System.out.println("사각형의 넓이 : "+answer);
	}
}
