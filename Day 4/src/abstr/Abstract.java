package abstr;

public class Abstract {

}
abstract class Animal {
	   abstract void makeSound();

	   public void eat() {
	      System.out.println("Can eat");
	   }
	}

	class L extends Animal {

	   public void makeSound() {
	      System.out.println("Can Bark");
	   }
	}

	class Abeg {
	   public static void main(String[] args) {

	      L l = new L();

	      l.makeSound();
	      l.eat();
	   }
	}
