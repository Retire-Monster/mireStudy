package com.java.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Gugudan {

	public static void main(String[] args) {
		int dan = 2;
		int gap = 9;
		
		String resultStr = "";
		
		for(dan = 2;dan < 10; dan++) {
			resultStr += dan+"단\n";
			for (gap = 1; gap<10;gap++) {
				resultStr += dan + " * " + gap + " = " +(dan*gap) + "\n";
			}
			resultStr += "\n";
		}
		
		System.out.println(resultStr);
		
		try {
			File file = new File("Gugudan.txt");
			if (!file.exists()) file.createNewFile();
			FileWriter Writer = new FileWriter(file);
			Writer.write(resultStr);
			Writer.close();
			System.out.println("구구단 파일쓰기 성공");
		} catch (IOException e) {
			e.printStackTrace();
			
			System.out.println("구구단 파일쓰기 실패");

		}
	}
}
