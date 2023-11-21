package java_basic;

import java.util.Scanner;

public class D002_03_Operation1 {

	public static void main(String[] args) {
//==================================================================================//
		//일반화 안된 자료
		System.out.println("첫번째 정수\t: "+3);
		System.out.println("두번째 정수\t: "+5);
		System.out.println("더하기\t\t: "	+(3+5));
		System.out.println("빼기\t\t: "		+(3-5));
		System.out.println("곱하기\t\t: "	+(3*5));
		System.out.println("나누기\t\t: "	+(3f/5));
		System.out.println();
		System.out.println("몫\t\t: "		+(5/3));
		System.out.println("나머지\t\t: "	+(5%3));
		
//==================================================================================//
		System.out.println("=======================================================");
//==================================================================================//
		//일반화 된 자료
		int firstInt 	= 3;
		int	sencondInt 	= 5;
		
		float sum 	= firstInt + sencondInt;
		float minus = firstInt - sencondInt;
		float multi = firstInt * sencondInt;
		float div 	= firstInt / (float)sencondInt;
		
		int mock 	= sencondInt / firstInt;
		int namuji 	= sencondInt % firstInt;
		
		System.out.println("첫번째 정수\t: "+firstInt);
		System.out.println("두번째 정수\t: "+sencondInt);
		System.out.println("더하기\t\t: "	+sum);
		System.out.println("빼기\t\t: "		+minus);
		System.out.println("곱하기\t\t: "	+multi);
		System.out.println("나누기\t\t: "	+div);
		System.out.println();
		System.out.println("몫\t\t: "		+mock);
		System.out.println("나머지\t\t: "	+namuji);
		
//==================================================================================//
		System.out.println("=======================================================");
//==================================================================================//
		//임의의 두 정수를 입력받아 출력하기
		Scanner scann = new Scanner(System.in);
		int firstIntA 	= 0;
		int	sencondIntA = 0;
		float sumA = 0f;
		float minusA = 0f;
		float multiA = 0f;
		float divA = 0f;
		int mockA = 0;
		int namujiA = 0;
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		firstIntA 	= scann.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		sencondIntA	= scann.nextInt();
		
		sumA 	= firstIntA + sencondIntA;
		minusA = firstIntA - sencondIntA;
		multiA = firstIntA * sencondIntA;
		divA 	= firstIntA / (float)sencondIntA;
		mockA 	= sencondIntA / firstIntA;
		namujiA 	= sencondIntA % firstIntA;
		
		System.out.println("첫번째 정수\t: "+firstIntA);
		System.out.println("두번째 정수\t: "+sencondIntA);
		System.out.println("더하기\t\t: "	+sumA);
		System.out.println("빼기\t\t: "		+minusA);
		System.out.println("곱하기\t\t: "	+multiA);
		System.out.println("나누기\t\t: "	+divA);
		System.out.println();
		System.out.println("몫\t\t: "		+mockA);
		System.out.println("나머지\t\t: "	+namujiA);
		
	}

}