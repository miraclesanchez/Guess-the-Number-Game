package Abstraction;

public class Eagle implements animal_interface, bird_interface{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Flies up to 10,000 ft");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eats reptiles and rodents");
	}
	

}
