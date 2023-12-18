package com.java.io;

import java.io.File;
import java.io.IOException;

public class Example01 {

	public static void main(String[] args) {
		File filePath = new File("c:\\temp\\java\\file");
		File fileObj = new File("c:\\temp\\java\\file", "exmole01.txt"); // 경로를 주지 않을 경우 루트 디렉토리를 기본 위치로 한다.
//경로지정 예시 ("c:\\temp\\java\\file","exmole01.txt");
//		File fileObj = new File("c:\\temp\\java\\file","exmole01.txt");
		try {

			filePath.mkdirs();
//			fileObj.mkdirs();	디렉토리가 없으면 경로상에 디렉토리를 만들면서 감
//			fileObj.mkdir();	마지막 경로만 만듬
			boolean success = fileObj.createNewFile(); // 만들려는 해당 파일이 존재할 경우 false 를 반환함
			if (success) {
				System.out.println("파일 생성 성공");

			} else {
				System.out.println("파일 생성 실패");
			}

			if (fileObj.exists()) { // 'fileObj' 파일이 있을때만 아래 정보를 콘솔에 표시하겠다
				System.out.println(fileObj.getPath());
				System.out.println(fileObj.getAbsolutePath());
				System.out.println(fileObj.getName());
				System.out.println(fileObj.exists());	// 파일이 있는가?
				System.out.println(fileObj.canRead());	// 읽기 권한이 있는가?
				System.out.println(fileObj.canWrite());	// 읽기, 쓰기 권한이 있는가?
				System.out.println(fileObj.length());	// 파일크기를 바이트 단위로 반환한다.

			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
