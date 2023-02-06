package encapsulation;

public class AnimalTest {

	public static void main(String[]args) {
		Animal newAnimal=new Animal();
		newAnimal.setName("Dog");
		newAnimal.setWeight(4.6);
		newAnimal.setNumLegs(4);
		
		System.out.println("Name: "+newAnimal.getName());
		System.out.println("Weight: "+newAnimal.getWeight());
		System.out.println("Legs: "+newAnimal.getNumLegs()+"\n");
		
		
		
		//Another way to initialize the object
		Animal notsonewAnimal=new Animal("Bill", 45.6,6);
		System.out.println("Name: "+notsonewAnimal.getName());
		System.out.println("Weight: "+notsonewAnimal.getWeight());
		System.out.println("Legs: "+notsonewAnimal.getNumLegs());
	}
}
