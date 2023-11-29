package com.java.collection;

import java.util.HashMap;
import java.util.Map;

public class Exercise_Map {

	public static void main(String[] args) {
		
		Map map = new HashMap();
		map.put("a",123);
		map.put("b",456);
		map.put("c",'A');
		map.put("d",456);
		map.put("e",true);
		map.put("f",789f);
		
		
		for (int i =0;i<map.size();i++) {
			char temp = 'a';
			String key = ""+(char)(i+temp);
			System.out.println("key : " + key + ", value : " +map.get(key));
			
			
		}
		
	}

}
