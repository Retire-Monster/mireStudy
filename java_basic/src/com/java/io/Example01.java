package com.java.io;

import java.io.File;
import java.io.IOException;

public class Example01 {

	public static void main(String[] args) {
		File filePath = new File("c:\\temp\\java\\file");
		File fileObj = new File("c:\\temp\\java\\file", "exmole01.txt"); // ��θ� ���� ���� ��� ��Ʈ ���丮�� �⺻ ��ġ�� �Ѵ�.
//������� ���� ("c:\\temp\\java\\file","exmole01.txt");
//		File fileObj = new File("c:\\temp\\java\\file","exmole01.txt");
		try {

			filePath.mkdirs();
//			fileObj.mkdirs();	���丮�� ������ ��λ� ���丮�� ����鼭 ��
//			fileObj.mkdir();	������ ��θ� ����
			boolean success = fileObj.createNewFile(); // ������� �ش� ������ ������ ��� false �� ��ȯ��
			if (success) {
				System.out.println("���� ���� ����");

			} else {
				System.out.println("���� ���� ����");
			}

			if (fileObj.exists()) { // 'fileObj' ������ �������� �Ʒ� ������ �ֿܼ� ǥ���ϰڴ�
				System.out.println(fileObj.getPath());
				System.out.println(fileObj.getAbsolutePath());
				System.out.println(fileObj.getName());
				System.out.println(fileObj.exists());	// ������ �ִ°�?
				System.out.println(fileObj.canRead());	// �б� ������ �ִ°�?
				System.out.println(fileObj.canWrite());	// �б�, ���� ������ �ִ°�?
				System.out.println(fileObj.length());	// ����ũ�⸦ ����Ʈ ������ ��ȯ�Ѵ�.

			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
