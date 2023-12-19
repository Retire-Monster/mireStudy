package com.java.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Example05 {

	public static void main(String[] args) {
		// ������ �б�
		File file = new File("example03.txt");
		if (!file.exists()) {
			System.out.println("������ �������� �ʽ��ϴ�.");
			return; // �޼ҵ带 �����Ѵٴ� �ǹ�
		}
		try {
			FileReader fis = new FileReader(file);
			BufferedReader br = new BufferedReader(fis);
			int i = 0;
//			while ((i = fis.read()) != -1) {			//�� �ܾ ������ ��
//				System.out.println((char) i);
//			}
			String str = null;
			while ((str = br.readLine()) != null) { //���پ� ���������� ���๮��'/n' �� �������� ����
				System.out.print(str+"\n");
			}
			fis.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}