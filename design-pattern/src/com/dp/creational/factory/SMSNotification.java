/**
 * 
 */
package com.dp.creational.factory;

/**
 * @author dell
 *
 */
public class SMSNotification implements Notification{

	@Override
	public void notifyUser() {
		System.out.println("Sending SMS Notification !!!");
	}

}
