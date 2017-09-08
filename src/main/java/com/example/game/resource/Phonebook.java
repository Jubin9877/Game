package com.example.game.resource;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Phonebook {

	public static void main(String args[]) {
		Map<String,String> phonebook = new Hashtable<>();
		
		// Add some vehicles.
		phonebook.put("Jubin", "9926311477");
		phonebook.put("Pratik", "9909090900");
		phonebook.put("Harsh", "92113123131");
		phonebook.put("Vijay", "98232242323");
		
		// Iterate over all vehicles, using the keySet method.
		for(String key: phonebook.keySet())
			System.out.println(key + " - " + phonebook.get(key));
		System.out.println();
		
//		Set<String> Keys = phonebook.keySet();
//		for(String i :Keys)
//		{
//			System.out.println(i +":"+phonebook.get(i));
//		}
		
	}
}
 