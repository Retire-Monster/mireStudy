package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExcersiseList {

	public static void main(String[] args) {
//											��> lise�� �ڷ����� ������ int �� �̴�
		List<Integer>list = new ArrayList<Integer>();
//				��> lise�� �ڷ����� ������ int �� �̴�
//		���� Ŭ����
//		primitive Ÿ���� ��äȭ
//		��> byte, short, int, long, float, double, chor, boolean
		
//		Integer a = 1;
		
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(2);
		list.add(5);
//		list.add('a');
//		list.add("a");
//		list.add(false);
//		list.add(1.0f);
//		list.add(1.0);
//		list.add(1l);
		
		
		Collections.sort(list,Collections.reverseOrder());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(i+"������ : "+list.get(i));
		}
	}

}
