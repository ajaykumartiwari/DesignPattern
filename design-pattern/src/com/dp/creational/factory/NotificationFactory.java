/**
 * 
 */
package com.dp.creational.factory;

/**
 * @author Ajay Tiwari
 *
 */
public class NotificationFactory {

	public Notification createNotification(String notificationType) {
		if (notificationType == null || notificationType.isEmpty()) {
			return null;
		}
		switch (notificationType) {
		case "SMS": {
			return new SMSNotification();
		}
		case "EMAIL": {
			return new EmailNotification();
		}
		case "PUSH": {
			return new PushNotification();
		}
		default:
			throw new IllegalArgumentException("Invalid Notification Type : " + notificationType);
		}
	}
}
