package com.example.game.resource;

public abstract class Animal {

	int age;
	String gender;
	int weightInLabs;
	
	public Animal(int age,String gender,int weightInLabs) {
		this.age = age;
		this.gender = gender;
		this.weightInLabs = weightInLabs;
	}
	
	public void eat() {
		System.out.println("Eating......");
	}
	
	public void sleep() {
		System.out.println("Sleeping......");
	}
	
	public abstract void move();
}
