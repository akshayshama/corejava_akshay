package org.tns.sf.java;

class Human1{
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class AfterEncapsulation {

	public static void main(String[] args) {
		Human obj=new Human();
		obj.setName("james");
		obj.setAge(25);
		
		
		obj.setName("Raam");
		obj.setAge(26);
		System.out.println(obj.getAge());
		System.out.println(obj.getName());

	}

}
