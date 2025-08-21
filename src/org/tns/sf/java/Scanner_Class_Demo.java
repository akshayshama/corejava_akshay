package org.tns.sf.java;
import java.util.*;

public class Scanner_Class_Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur age:");
		int age  = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter ur age:");
		String name = sc.nextLine();
		System.out.println(name+"@"+age);
	}

}



