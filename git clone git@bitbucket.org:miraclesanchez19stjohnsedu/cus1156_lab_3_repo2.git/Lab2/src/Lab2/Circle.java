package Lab2;

public class Circle extends Shape{

	public double radius;
	
	Circle(double radius){
		this.radius=radius;
	}

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return (Math.PI)*(radius*radius);
	}

	@Override
	double calculateCircumference() {
		// TODO Auto-generated method stub
		return (Math.PI)*(2)*(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	//Accessors and mutators enforce the encapsulation principle in OOP. This condenses the code and hides data from other classes until the methods are called. 
	
	 /* What are the primary differences between abstracts and interfaces in Java? How would you implement this assignment using interfaces?
	  * In Java, abstract classes or methods are clean slates. You simply name the method and can change their functions and outputs depending on the class that extends it. 
	  * Interfaces can be used for multi-class implementation to use the same method accross different classes. With interfaces you must directly call the interface because it doesn't implement a main method.
	  * 
	  * I would create a shape interface with an area method because all shapes have an area. I would also create a circle interface for the circumference since it's the only shape in the problem that requires it.
	 */
	
}
