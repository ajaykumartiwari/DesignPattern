/**
 * 
 */
package com.dp.creational.factory;

/**
 * @author dell
 *
 */
public class EmailNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Sending Email Notification !!!");
	}

}
