package edu.neit.jonathandoolittle.subscribers;

import edu.neit.jonathandoolittle.publishing.BusinessNewsPublisher;
import edu.neit.jonathandoolittle.publishing.NewsPublisher;

/**
 * A subscriber who receives updates via sms
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 30, 2021
 *
 */
public class SmsSubscriber implements Subscriber {

	// ******************************
	// Variables
	// ******************************
	
	private String phoneNumber;

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new SmsSubscriber instance
	 */
	public SmsSubscriber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// ******************************
	// Private methods
	// ******************************
	
	/**
	 * Mock sending a text
	 * @param text The text to send
	 */
	private void sendText(String text) {
		System.out.println("bzzzz-bzzzz, you [" +  phoneNumber + "] got a new message:\n\t" + text);
		System.out.println();
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public void update(NewsPublisher publisher) {
		
		// This is how we handle business news
		if(publisher instanceof BusinessNewsPublisher) {
			// For our mobile users, we don't want to get the whole article, just the headline!
			String headline = ((BusinessNewsPublisher) publisher).getLatestNewsHeadline();
			sendText(headline);
		}

	}
}
