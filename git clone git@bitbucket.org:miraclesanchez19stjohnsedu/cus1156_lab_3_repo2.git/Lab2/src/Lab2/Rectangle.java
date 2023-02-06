package Lab2;

public class Rectangle extends Shape {
	
	public double height;
	public double width;
	
	Rectangle(double h, double w){
		this.height=h;
		this.width=w;
	}
	
	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return height*width;
	}

	@Override
	double calculateCircumference() {
		// TODO Auto-generated method stub
		return 0;
	}

}
