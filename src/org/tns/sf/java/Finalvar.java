package org.tns.sf.java;

class UPI{
	final int Max_Daily_Limit=100000;
	
	void showLimit() {
		System.out.println("daily Transfer"+Max_Daily_Limit);
	}
}

public class Finalvar {

	public static void main(String[] args) {
		UPI u = new UPI();
		u.showLimit();

	}

}
