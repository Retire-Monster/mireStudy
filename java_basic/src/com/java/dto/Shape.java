package com.java.dto;

public abstract class Shape {
//	���ø����� ����� - �߻�Ŭ����
//	�߻� Ŭ������ �ν��Ͻ��� ���� �� ����

//	Shape Ŭ������ ��ӹ����� �Ʒ� ���� ��������.
	public final static String copyWriter = "������";
//  ���ٰ� ������ ������ �ڷ���	������	=	��

	public abstract void inputData();
	public abstract int surface();
	public abstract String outputMessage();
}
