package Abstraction;

public class testAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal newBird=new Bird(); //works because animal is the super class
		newBird.eat();
		newBird.sleep();
		newBird.move();
		
		System.out.println("\n");
		
		Animal newFish=new fish();
		newFish.eat();
		newFish.move();
		newFish.sleep();
	}

}
