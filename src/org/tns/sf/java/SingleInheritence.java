package org.tns.sf.java;

class Course{
	String coursename="JavaProgramming";
	
	void showCourse() {
		System.out.println("Course:"+coursename);	
		}
}
class Student extends Course{
	String name="Akshay";
	
	void showStudent() {
		System.out.println("Student:"+name);
	}
}


public class SingleInheritence {

	public static void main(String[] args) {
		Student s=new Student();
		s.showStudent();
		s.showCourse();

	}

}
