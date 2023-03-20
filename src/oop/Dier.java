package oop;

abstract class Dier {
	public String name;
	
	public abstract void makeSound();
	public abstract void lovesWalks();
	
	public void printName() {
		System.out.println(name);
	}
}
