package Abstraction;

/* Inheritance makes it possible to create a child class that 
 * inherits the field sand methods of a parent class
 * child class could override the methods of the parent class
 * it can also add it's own functionality and data. Java uses the extends keyword
 * -Child class inherits features of a parent class
 * -implements the DRY (do not repeat yourself) programming principle
 * -increases/ improves code reusability
 * -multilevel inheritance is allowed in java
 * -multiple inheritances is not allowed
 */
public class Bird extends Animal{
	//Member Variables
	 protected String outerCovering="Feather";
	 protected String reproduction="eggs";
	
	public void flyUp() {
		System.out.println("flying up!!");
	}
	
	public void flyDown() {
		System.out.println("flying down!!");
	}
	

	//now that bird extends animal, we must include those hidden methods (move and sleep)
	void move() {
		System.out.println("Majority move by flying");
	}
	void sleep() {
		System.out.println("Majority sleep on trees");
	}
}
