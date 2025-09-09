package org.tns.sf.java;


class cellPhone implements Mobile{

	@Override
	public void turnOn() {
		System.out.println("Mobile is turnd on");
		
	}

	@Override
	public void turnOff() {
		System.out.print("Mobile is turnd off");
		
	}

	@Override
	public void features() {
		System.out.print("Mobile has best features");
		
		
	}
	
}

public class Samsung {

	public static void main(String[] args) {
		Mobile obj = new cellPhone();
		obj.turnOn();
		obj.turnOff();
		obj.features();

	}

}
