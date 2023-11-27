package project_a;

import java.util.Scanner;

public class ForTriangleVO {
	
	public int baseLine = 0;
	public int high = 0;
	public float answer = 0;
	
	
	public void UserInput() {
	Scanner scann = new Scanner(System.in);
	System.out.println("==========================");
	System.out.println("ªÔ∞¢«¸¿« ≥–¿Ã∏¶ ±∏«’¥œ¥Ÿ");
	System.out.println("πÿ∫Ø x ≥Ù¿Ã / 2 = ≥–¿Ã");
	System.out.println("==========================");
	System.out.print("πÿ∫Ø : ");
	baseLine = scann.nextInt(); scann.nextLine();
	System.out.print("≥Ù¿Ã : ");
	high = scann.nextInt(); scann.nextLine();
	answer = baseLine*high/2;
	System.out.println("ªÔ∞¢«¸¿« ≥–¿Ã : "+answer);
	}
}
