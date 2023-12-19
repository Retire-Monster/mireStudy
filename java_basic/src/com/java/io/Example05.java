package com.java.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Example05 {

	public static void main(String[] args) {
		// 파일의 읽기
		File file = new File("example03.txt");
		if (!file.exists()) {
			System.out.println("파일이 존재하지 않습니다.");
			return; // 메소드를 종료한다는 의미
		}
		try {
			FileReader fis = new FileReader(file);
			BufferedReader br = new BufferedReader(fis);
			int i = 0;
//			while ((i = fis.read()) != -1) {			//한 단어씩 가져올 때
//				System.out.println((char) i);
//			}
			String str = null;
			while ((str = br.readLine()) != null) { //한줄씩 가져오지만 개행문자'/n' 은 가져오지 않음
				System.out.print(str+"\n");
			}
			fis.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}