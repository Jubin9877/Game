package com.example.game.resource;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DemoClass {

	public static void main(String args[]) throws Exception {
		
//		int values[] = new int[4];
//		Object values1[] = new  Object[4];
//		values1[0] = "Jubin";
//		values1[1] = 7;
		
		List<Integer> values = new ArrayList<Integer>();
		values.add(3);
		values.add(9877);
		values.add(1234);
		
		Collections.sort(values);
		values.forEach(System.out::println);//Stream API .. Lambda Expression
		//values.remove(3);
//		Iterator i = values.iterator();
//		
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		
//		for(Integer i : values)
//		{
//			System.out.println(i);
//		}
	}
}
