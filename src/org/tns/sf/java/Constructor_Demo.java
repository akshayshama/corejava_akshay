package org.tns.sf.java;

class User1{
	String name;
	int age;
	
	User1(){
		name="Guest";
		age=23;
		System.out.println(name + " "+age);
	}
	User1(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("User Created:"+name+age);
	}
}

public class Constructor_Demo {

	public static void main(String[] args) {
		User1 obj=new User1();
		User1 obj1=new User1("james",26);
		

	}

}
