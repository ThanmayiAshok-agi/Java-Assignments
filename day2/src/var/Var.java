package var;

public class Var {
	public String name;
	 
	public int marks;
	 
	public Var (String sName) {
	name = sName;
	}
	public void setMarks(int sMar) {
	marks = sMar;
	}
	public void printStu() {
	System.out.println("Name: " + name );
	System.out.println("Marks:" + marks);
	}
	 
	public static void main(String args[]) {
	Var SOne = new Var("a");
	Var STwo = new Var("b");
	Var SThree = new Var("c");
	 
	SOne.setMarks(98);
	STwo.setMarks(89);
	SThree.setMarks(90);
	 
	SOne.printStu();
	STwo.printStu();
	SThree.printStu();
	}
}
