package oop;

public class Product {
	
	public String name;
	public int quantity;
	public boolean onSale;
	public float price;
	
	// String
	// int
	// boolean
	// double/float (64bits/32bits)
	
	// constructor gets called at initialization
	public Product() {
		System.out.println("In construction");
	}
	
	public Product(String name) {
		this.name = name;
	}
	
	public Product(int quantity) {
		this.quantity = quantity;
	}
	
	public Product(String name, int quantity, boolean onSale, float price) {
		this.name = name;
		this.quantity = quantity;
		this.onSale = onSale;
		this.price = price;
	}
	
	public void printName() {
		System.out.println("Naam is " + name);
	}
	
	public void printQuantity() {
		System.out.println("Er zijn " + quantity + " producten op voorraad");
	}
	
	public void printPrice() {
		System.out.println("De prijs is " + price + " euro");
	}
	
	public void changeName(String name) {
		this.name = name; // "this." to refer to class property
	}
	
	public void changeQuantity(int delivered) {
		this.quantity += delivered;
	}
	
	public void changePrice(float new_price) {
		this.price = new_price;
	}
	
	public String whatIsYourName() {
		return name;
	}

}
