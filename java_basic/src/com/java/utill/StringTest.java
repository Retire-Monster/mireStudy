package com.java.utill;

public class StringTest {

	public static void main(String[] args) {
		String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
				
		System.out.println(str);
		System.out.println(str.charAt(10));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.substring(10));
		System.out.println(str.substring(0,10));
		
		String str2 = "010-1234-5678";
		String[] strArray = str2.split("-");
		System.out.println(strArray[1]);
		System.out.println(str2.matches("^\\d{2,3}-\\d{3,4}-\\d{4}$"));
		System.out.print(str.contentEquals(str2));
	}

}
