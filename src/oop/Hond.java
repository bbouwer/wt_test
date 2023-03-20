package oop;

// "extends" shows inheritance from Dier
public class Hond extends Dier{
	public void makeSound() {
		System.out.println("Woef");
	}
	
	public void lovesWalks() {
		System.out.println(name + " loves walks");
	}
}
