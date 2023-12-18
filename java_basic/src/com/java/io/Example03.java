package com.java.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Example03 {

	public static void main(String[] args) {

		try {
			File file = new File("example03.txt");
		
		if (!file.exists())
			file.createNewFile();
		
		FileWriter myWriter = new FileWriter(file);
		
		myWriter.write("Hello!!\n");
		myWriter.write("Java Programming");
		myWriter.close();
		
			System.out.println("\n 파일 쓰기 성공");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
