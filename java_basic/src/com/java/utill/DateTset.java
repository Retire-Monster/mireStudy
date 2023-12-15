package com.java.utill;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTset {

	public static void main(String[] args) {

		Date today = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
//		String 을 date 로 변환
		String todayStr = format.format(today);
		System.out.println(todayStr);
		
		
		todayStr = "2024-09-26 17:25:06";
//		date 를 String 로 변환

		try {
			Date theDay = format.parse(todayStr);
			System.out.println(theDay);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
