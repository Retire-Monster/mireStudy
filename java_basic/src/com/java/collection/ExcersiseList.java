package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ExcersiseList {

	public static void main(String[] args) {

		List list = new ArrayList();
//		·¦ÆÛ Å¬·¹½º
//		primitive Å¸ÀÔÀ» °´Ã¤È­
//		¦¦> byte, short, int, long, float, double, chor, boolean
		
		Integer a = 1;
		
		list.add(1);
		list.add(2);
		list.add('a');
		list.add("a");
		list.add(false);
		list.add(1.0f);
		list.add(1.0);
		list.add(1l);
		
		System.out.println();
		
	}

}
