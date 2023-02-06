package Lab2;

public class Triangle extends Shape{
	
	public double height;
	public double base;

	Triangle(double h, double b){
		this.height=h;
		this.base=b;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return (height+base)/2;
	}

	@Override
	double calculateCircumference() {
		// TODO Auto-generated method stub
		return 0;
	}

}
