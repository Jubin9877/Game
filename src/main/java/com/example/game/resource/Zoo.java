package com.example.game.resource;

public class Zoo {

	public static void main(String args[])
	{
//		Animal animal1 = new Animal(25, "M", 54);
//		animal1.eat();
//		
//		Bird bird1 = new Bird(3,"m",25);
//		bird1.eat();
//		bird1.sleep();
		
//		Sparrow sparrow1 =  new Sparrow(1, "M", 4);
//		//sparrow1.move();
//		
//		Fish fish1 = new Fish(1,"3", 15);
//		fish1.move();
//		
//		moveAnimals(sparrow1);
//		moveAnimals(fish1);
		
		Flyable flyingBird = new Sparrow(1,"m",4);				
	}
	
	public static void  moveAnimals(Animal animal) {
		animal.move();
	}
}
