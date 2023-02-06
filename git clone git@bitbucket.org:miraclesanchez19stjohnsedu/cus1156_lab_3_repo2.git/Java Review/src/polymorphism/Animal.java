package polymorphism;
//Encapsulated the properties of an Animal
//Provides a mechanism to protect the data stored in a class, from external system wide access. Implemented in java using ...

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
