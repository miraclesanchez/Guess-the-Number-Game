package Lab2;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle one=new Rectangle(3.4,2.6);
		System.out.println("Area is: "+one.calculateArea());
		System.out.println("Circumference is: "+one.calculateCircumference());
		
		System.out.println("Height is: "+one.getHeight());
		System.out.println("Width is: "+one.getWidth());
		
		one.setHeight(5.6);
		one.setWidth(3.0);
		
		System.out.println("Height is now: "+one.getHeight());
		System.out.println("Width is now: "+one.getWidth()+"\n");
		
		Rectangle two=new Rectangle(6.4,9.6);
		System.out.println("Area is: "+two.calculateArea());
		System.out.println("Circumference is: "+two.calculateCircumference());
		
		System.out.println("Height is: "+two.getHeight());
		System.out.println("Width is: "+two.getWidth());
		
		one.setHeight(2.6);
		one.setWidth(3.8);
		
		System.out.println("Height is now: "+two.getHeight());
		System.out.println("Width is now: "+two.getWidth()+"\n");
	}
	
	
	

}
