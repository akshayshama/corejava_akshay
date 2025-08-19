package org.tns.sf.java;

class Prodkt{
	
	double price;
	
	Prodkt(double price){
		this.price=price;
	}
double calculateDiscount() {
	return this.price*0.10;
}
double calculateFinal() {
	return this.price-this.calculateDiscount()
;}
}

public class ThisKeyword_demo {

	public static void main(String[] args) {
		Prodkt pd=new Prodkt(1000);
		System.out.println("Final price:"+pd.calculateFinal());
//		System.out.print("Final price:"+pd.calculateFinal());
		

	}

}
