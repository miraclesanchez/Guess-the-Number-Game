package Lab2;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle one=new Circle(3.2);
		System.out.println("Radius is: "+one.getRadius());
		System.out.println("The area is: "+one.calculateArea());
		System.out.println("The circumference is: "+one.calculateCircumference());
		
		one.setRadius(4.6);
		System.out.println("Radius has been changed to: "+one.getRadius()+"\n");
		
		
		Circle two=new Circle(5.6);
		System.out.println("Radius is: "+two.getRadius());
		System.out.println("The area is: "+two.calculateArea());
		System.out.println("The circumference is: "+two.calculateCircumference());
		two.setRadius(3.6);
		System.out.println("Radius has been changed to: "+two.getRadius());
}
}
