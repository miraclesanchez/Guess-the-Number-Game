package Lab2;

public class TestTriangle {
	public static void main (String [] args) {
		
		Triangle one = new Triangle(5.6,7.8);
		System.out.println("Area is: "+one.calculateArea());
		System.out.println("Circumference is: "+one.calculateCircumference());
		
		System.out.println("Height is: "+one.getHeight());
		System.out.println("Width is: "+one.getBase());
		
		one.setHeight(5.6);
		one.setBase(3.0);
		
		System.out.println("Height is now: "+one.getHeight());
		System.out.println("Width is now: "+one.getBase()+"\n");
		
		Rectangle two=new Rectangle(6.4,9.6);
		System.out.println("Area is: "+two.calculateArea());
		System.out.println("Circumference is: "+two.calculateCircumference());
		
		System.out.println("Height is: "+two.getHeight());
		System.out.println("Width is: "+two.getWidth());
		
		one.setHeight(2.6);
		one.setBase(3.8);
		
		System.out.println("Height is now: "+two.getHeight());
		System.out.println("Width is now: "+two.getWidth()+"\n");
	}
	
	
	

}