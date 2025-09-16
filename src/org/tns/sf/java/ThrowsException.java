package org.tns.sf.java;

import java.io.IOException;

public class ThrowsException {
	
	void printing() {
		System.out.println("print java");
	}
	
	void scan( )throws IOException{
		System.out.println("device error");
		
	}
	
	void verify() throws ArithmeticException,IOException,ClassNotFoundException{
		System.out.println("tech error");
	}

	public static void main(String[] args) {
		ThrowsException obj=new ThrowsException();
		obj.printing();
		
		try {
			obj.scan();
		}
		catch(IOException e){
			System.out.println(e);
		}
		try {
			obj.verify();
		}
		catch(IOException e) {
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}

		
		

	}

}
