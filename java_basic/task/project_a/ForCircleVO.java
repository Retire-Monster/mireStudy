package project_a;

import java.util.Scanner;

public class ForCircleVO {
	
	public final double PI = Math.PI;
	public int radius = 0;
	public float answer = 0;
	
	
	public void UserInput() {
	Scanner scann = new Scanner(System.in);
	System.out.println("==========================");
	System.out.println("원의 넓이를 구합니다");
	System.out.println("반지름 x 반지름 x π = 넓이");
	System.out.println("==========================");
	System.out.print("반지름 : ");
	radius = scann.nextInt(); scann.nextLine();
	answer = (int)(radius*radius*(PI*100)/10)/10f;
	System.out.println("원의 넓이 : "+answer);
	}
}
