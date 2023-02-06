package encapsulation;
/*Encapsulation: Provides a mechanism to protect the data stored in a class, from external system wide access. Implemented in java using the private keyword for the class variables, and providing getter and setter methods to each of them.
* - Fields/variables to private
* - Each field has a getter and setter method
* - Getters return the field
* - Setter change the value of the field
* */

public class Animal {
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
		System.out.println("This animal eats: ");
	}

}
