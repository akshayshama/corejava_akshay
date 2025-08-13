package org.tns.sf.java;

class Emp{
	void emp(){
		System.out.println("Company:ABC");
	}
}
class Dev extends Emp{
	void role(){
		System.out.println("role");
	}
}
class Test extends Emp{
	void lore() {
		System.out.println("rlo");
	}
}

public class HierarchialInheritence {

	public static void main(String[] args) {
		Emp e=new Emp();
		e.emp();
		e.role();
		e.lore();

	}

}
