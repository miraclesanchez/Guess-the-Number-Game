public class Student {
	
	String name;
	double GPA;
	int gradYear;
	
	public Student(String n, double g, int year) {
		this.name=n;
		this.GPA=g;
		this.gradYear=year;
	}
	
	public String getStudentName() {
		return name;
	}
	
	public double getgpa() {
		return GPA;
	}
	
	public int getgradyear() {
		return gradYear;
		
	}
}

