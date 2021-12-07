package abstr;

public class Bike {

}
abstract class Motor {
	   abstract void Brake();
	}

	class MB extends Motor {

	   public void Brake() {
	      System.out.println("MotorBike is working!!");
	   }
	}

	class I {
	   public static void main(String[] args) {

	      MB mb = new MB();

	      mb.Brake();
	   }
	}
