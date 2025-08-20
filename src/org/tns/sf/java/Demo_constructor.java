package org.tns.sf.java;
class Product{
	int id;
	String Product_name;
	
	void print() {
		System.out.println(id+" "+Product_name);
	}
}

public class Demo_constructor {

	public static void main(String[] args) {
		Product prod=new Product();
		prod.print();
		
	}

}
