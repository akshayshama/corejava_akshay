package org.tns.sf.java;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		
		int numbers[]=new int[4];
		
		try {
			numbers[9]=50/0;
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeicException "+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException "+e.getMessage());
			
		}
		catch(Exception e){
			System.out.println("An Unexpected exception "+e.getMessage());

			
		}
	}

}
