package my_java;

import java.util.Scanner;

/*Write a program to print the names of students by creating a Student class. 
If no name is passed while creating an object of the Student class, then the name should be "Unknown", 
otherwise the name should be equal to the String value passed while creating the object of the Student class.*/
public class Student{
	String Myname;
	String Name;
	
	 public Student (String Myname) {
		Name = Myname;
	}
	public Student() {
		Name = "unknown";
	}
}
 	public  Student {
	public static void main(String[] args) {
		Student obj = new Student();
		obj.Myname="kalpesh";
		Student obj1 = new Student();
		System.out.println(obj.Myname);
		System.out.println(obj1.Myname);

	
	}
	
	
}

















