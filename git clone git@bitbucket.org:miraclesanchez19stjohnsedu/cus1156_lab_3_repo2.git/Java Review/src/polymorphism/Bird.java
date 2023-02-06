package polymorphism;

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
	 
	 //protected makes it so anything outside of the inheritance classes will not see these variables
	 //private makes it so no classes outside of this one will see them
	
	
	public void flyUp() {
		System.out.println("flying up!!");
	}
	
	public void flyDown() {
		System.out.println("flying down!!");
	}
	
	//Overriding
	/* Dynamic Polymorphism
	 * overriding feature in Java
	 * 
	 */
	public void eat() {
		System.out.println("Birds eat seeds");
	}
	
	//Overloading
	/*Static polymorphism:
	 * method overloading -> several methods
	 * with the same name in a class
	 * however, the number of parameters and their names can be different
	 * 
	 */
	public void eat(String food) {
		System.out.println("Birds eat "+food);
	}
	

}
