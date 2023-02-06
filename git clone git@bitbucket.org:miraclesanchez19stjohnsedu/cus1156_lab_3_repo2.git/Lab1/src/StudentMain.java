import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<Student> CUS1156 = new ArrayList<Student>();
		
		Student jack=new Student("Jack Frost", 3.4, 2024);
		Student mike=new Student("Mike Joe", 1.5, 2023);
		Student susan=new Student("Susan Porter", 2.8, 2022);
		Student brooke=new Student("Brooke Davis", 3.4, 2024);
		Student dean=new Student("Dean Winchester", 4.0, 2025);
		CUS1156.add(jack);
		CUS1156.add(susan);
		CUS1156.add(mike);
		CUS1156.add(brooke);
		CUS1156.add(dean);
		
			for(Student student: CUS1156) {
			System.out.println("Student Name: "+student.getStudentName()+"\nGPA: "+student.getgpa()+"\nGraduation Year: "+student.getgradyear()+"\n");
			}
	}
}
