package com.dp.creational.factory;

public class FactoryDesignPattern {

	/**
	 * Factory Design Pattern we create object without exposing creation logic to the client.
	 * 
	 * The factory design pattern says that define an interface ( A java interface or an abstract class) 
	 * for creating object and let the subclasses decide which class to instantiate.
	 * 
	 * It is one of the best ways to create an object where object creation logic is hidden from the client
	 */
	public static void main(String[] args) {
		NotificationFactory notificationFactory = new NotificationFactory();
		Notification notification = notificationFactory.createNotification("SMS");
		notification.notifyUser();
	}

}
