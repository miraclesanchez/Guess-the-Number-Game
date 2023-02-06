package polymorphism;
/*Allows the same entity to be used in different forms
 * In Java you can declare multiple methods with the same name but different characteristics
 * Two ways: method overloading vs method overriding
 * 
 * 
 */
public class BirdTest {
	public static void main (String[]args) {
		Bird newBird=new Bird();
		Animal newAnimal=new Animal();
		newAnimal.eat();
		newBird.eat("food");
		
		newBird.flyUp();
		
	}

}
