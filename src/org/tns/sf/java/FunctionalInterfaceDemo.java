package org.tns.sf.java;

class EmailNotification implements NotificationService{

	@Override
	public void notifyUsers(String message) {
		System.out.println("sending email:"+message);
		
	}
	
}
class SMSNotification implements NotificationService{

	@Override
	public void notifyUsers(String message) {
		System.out.println("sending msg:"+message);
		
	}
	
}


public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		NotificationService obj=new EmailNotification();
		NotificationService obj1=new SMSNotification();
		
		
		obj.notifyUsers("hi");
		obj1.notifyUsers("GoodEvening");
		
		
	}

}
