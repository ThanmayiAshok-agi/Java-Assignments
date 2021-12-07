package DemoPackage;

import java.util.Scanner;

public class Mult {
	public static void main(String args[])
    {
		Scanner scan=new Scanner(System.in);
		Mks m= new Mks();
		m.ReadDetails();
		m.ReadMarks();
		m.DisplayDetails();
		m.DisplayMarks();
		m.Result();
		m.DisplayResult();
    }
}
class S{
	int studentId;
	String studentName,studentPhone;
	void ReadDetails() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter student id:");
		studentId=scan.nextInt();
		System.out.println("Enter student Name:");
		studentName=scan.next();
		System.out.println("Enter student Phone:");
		studentPhone=scan.next();
	}
	void DisplayDetails() {
		System.out.println("Enter student id:");
		System.out.println("Enter student Name:");
		System.out.println("Enter student Phone:");
	}
}
class Mks extends S{
	private static final String TotalMarks = null;
	int m1,m2,m3;
	private String percentage;
	private String grade;
	void ReadMarks() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter marks1:");
		m1=scan.nextInt();
		System.out.println("Enter marks2:");
		m2=scan.nextInt();
		System.out.println("Enter marks3");
		m3=scan.nextInt();
	
}
	public void Result() {
		// TODO Auto-generated method stub
		
	}
	void DisplayMarks() {
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
	}
	class Result extends Mks{
		int TotalMarks,percentage;
		String grade;
		void Result1() {
			Scanner scan=new Scanner(System.in);
			TotalMarks=m1+m2+m3;
			percentage=TotalMarks/3;
			if(percentage>=90) {
				grade="First Class";
			}
			else if(percentage>=70 && percentage<90) {
				grade="Second class";
			}
			else if(percentage>=60 && percentage<50) {
				grade="Third class";
			}
			else 
				grade="fail";
		}
	}
	void DisplayResult() {
		int TotalMarks,percentage;
		int grade = 0;
		TotalMarks=m1+m2+m3;
		percentage=TotalMarks/3;
		System.out.println("Total marks is "+TotalMarks);
		System.out.println("Percentge" + percentage);
		System.out.println("Grade is" + grade);
		
	}
}

