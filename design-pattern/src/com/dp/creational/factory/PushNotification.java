/**
 * 
 */
package com.dp.creational.factory;

/**
 * @author Ajay Tiwari
 *
 */
public class PushNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Sending Push Notification !!!");
	}

}
