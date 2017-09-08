package com.example.game.resource;

public class Sparrow extends Bird implements Flyable {

	public Sparrow(int age, String gender, int weightInLabs) {
		super(age, gender, weightInLabs);
		
	}

	public void fly() {
		System.out.println("sparrow flying high.....");
	}

}
