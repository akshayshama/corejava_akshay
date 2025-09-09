package org.tns.sf.java;

class SmartLight implements Smartdevice{

	@Override
	public void turnOn() {
		System.out.println("smart light is on");
		
	}

	@Override
	public void turnOff() {
		System.out.println("smart light is off");
		
	}

	@Override
	public void getStatus() {
		System.out.println("light is in standby");
		
	}

	@Override
	public void yamaMoto() {
		System.out.println("Bankai");
		
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Smartdevice obj=new SmartLight();
		obj.turnOn();
		obj.turnOff();
		obj.yamaMoto();

	}

}
