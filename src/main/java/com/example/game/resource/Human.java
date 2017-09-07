package com.example.game.resource;

public class Human {

	String name;
	int age;
	int heightInInches;
	String eyescolor;
	
	public Human() {
		
	}
	
	public void speak() {
		System.out.println("Hello My name is "+ name);
		System.out.println("i am " + heightInInches + "inches tall");
		System.out.println("I am "+age+"years old ");
		System.out.println("My eyes color is "+ eyescolor);
	}
	
	public void eat() {
		System.out.println("eating.......");	
	}
}
