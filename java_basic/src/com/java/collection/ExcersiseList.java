package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExcersiseList {

	public static void main(String[] args) {
//											┌> lise의 자료형은 무조건 int 형 이다
		List<Integer>list = new ArrayList<Integer>();
//				└> lise의 자료형은 무조건 int 형 이다
//		랩퍼 클레스
//		primitive 타입을 객채화
//		└> byte, short, int, long, float, double, chor, boolean
		
//		Integer a = 1;
		
		list.add(3);
		list.add(1);
		list.add(2);
//		list.add(0,5);		// list.set(번지,값) <- 입력된 번지에 입력값을 추가(다른 값 뒤로 밀림)
		list.set(0,5);		// list.set(번지,값) <- 입력된 번지의 값을 입력값으로 변경
		list.add(6);
		list.add(4);
//		list.add('a');
//		list.add("a");
//		list.add(false);
//		list.add(1.0f);
//		list.add(1.0);
//		list.add(1l);
		
		
//		Collections.sort(list,Collections.reverseOrder());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(i+"번지값 : "+list.get(i));
		}
	}

}
