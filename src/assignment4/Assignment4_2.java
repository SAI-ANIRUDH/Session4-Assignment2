package assignment4; // Declaring Package

public class Assignment4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Anirudh sa=new Anirudh();
sa.setname("Sai"); 
sa.setrollno(21); 
sa.student();
sa.enrollment();
//Though Anirudh class does not have setname(), setrollno() and student() methods , we are able to use them using IS-A relationship.

	}

}
class Student {
	private String name;
	private int rollno;
public void student (){
		System.out.println("Student name "+ name + " Rollno " +rollno );
	}
public void setname(String name) {
	this.name=name;
	
}
public void setrollno(int rollno) 
{
	this.rollno=rollno;
}
}
class Anirudh extends Student  // java class created to show "IS - A" relationship in Inheritance
{
	public void enrollment() // Calling Enrollment class methods in Anirudh Class
	{
Enrollment jc= new Enrollment();
jc.start(); // Anirudh class is using start() method of Enrollment class via composition.We can say that Anirudh class HAS-A Enrollment.
	}
}
class Enrollment // java classs created to show "Has - A" relationship in Inheritance
{
	public void start() // Start() method in Enrollment class
	{
		System.out.println("Java Classes Started For anirudh");
	}
		public void end() // End() method in Enrollment class
		{		{
			System.out.println("Java Classes Ended for anirudh");
		}
	}
	// Has A relationship is used to show composition relationship which is a productive way of reuse
		
}