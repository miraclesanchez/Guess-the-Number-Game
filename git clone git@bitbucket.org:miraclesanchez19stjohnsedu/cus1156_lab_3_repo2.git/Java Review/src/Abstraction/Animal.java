package Abstraction;
/* Abstraction: Hiding internal functionality of the object. Only show features 
 * 1. Abstract Classes
 * 2. Interfaces
 * 
 */

public abstract class Animal {
	//Member Variables
	private String name;
	private double weight;
	private int numLegs;
	
	//Constructor
	Animal(String n, double w, int nl){
		this.name=n;
		this.weight=w;
		this.numLegs=nl;	
	}
	
	Animal(){
		
	}

	//Getter Methods
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public int getNumLegs() {
		return numLegs;
	}
	
	//Setter Methods
	public void setName(String name) {
		this.name=name;
	}
	
	public void setWeight(double weight) {
		this.weight=weight;
	}
	
	public void setNumLegs(int numLegs) {
		this.numLegs = numLegs;
	}

	//Member Method
	public void eat() {
		System.out.println("This animal eats meat");
	}
	
	//Hide the following methods
	abstract void move();
	abstract void sleep();

}
