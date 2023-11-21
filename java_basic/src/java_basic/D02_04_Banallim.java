package java_basic;

import java.util.Scanner;

public class D02_04_Banallim {

	public static void main(String[] args) {		

		//본인 코드
		float num = 1234.56789f;		
		float numRound = (float)((int)((num+0.05)*10)*0.1);
		
		System.out.println("입력값\t: "+num);
		System.out.println("반올림\t: "+numRound);
		
//==================================================================================//
		System.out.println("=======================================================");
//==================================================================================//
		//선생님 코드
		
		float inputFloatA 	= 1234.56789f;
		float outputFloatA 	= 0f;
		//계산오류를 줄이기 위해 계산시 정수값을 사용함
		outputFloatA = (int)(inputFloatA*10+0.5f)/10f;
		
		
		System.out.println("입력값\t: "+inputFloatA);
		System.out.println("반올림\t: "+outputFloatA);
		
		//계산 오류를 막기위한 계산기의 구동방식
		//10000 * 0.5 -> 10000 * 100 / 50 / 100 -> 5000
		//실수형으로 되어있더라도 정수형으로 변환하여 값을 계산함
		 
//==================================================================================//
		System.out.println("=======================================================");
//==================================================================================//
		//수식에 남아있는 소수를 정수로 바꾸기
		
		float inputFloatB 	= 1234.56789f;
		float outputFloatB 	= 0f;
		outputFloatB = (int)((inputFloatB*100+5)/10)/10f;
		
		
		System.out.println("입력값\t: "+inputFloatB);
		System.out.println("반올림\t: "+outputFloatB);
		
//==================================================================================//
		System.out.println("=======================================================");
//==================================================================================//
		//임의의 실수값을 받아 반올림 하기
		Scanner scann = new Scanner(System.in);
		float inputFloatC 	= 0f;
		float outputFloatC 	= 0f;
		
		System.out.print("반올림할 실수를 입력하세요 : ");
		inputFloatC	= scann.nextFloat();
		
		outputFloatC = (int)((inputFloatC*100+5)/10)/10f;
			
		System.out.println("입력값\t: "+inputFloatC);
		System.out.println("반올림\t: "+outputFloatC);
		
	}

}
