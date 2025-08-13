package org.tns.sf.java;

class Device{
	void devicetype() {
		System.out.println("I am electronic device");
	}
}
class Phone extends Device{
	void brand() {
		System.out.println("Brand:samsung");
	}
}
class Smartphone extends Phone{
	void features() {
		System.out.println("Features:touchscreen,camera,Internet");
	}
}

public class MultiLevel {

	public static void main(String[] args) {
		Smartphone sp=new Smartphone();
		sp.devicetype();
		sp.brand();
		sp.features();

	}

}
