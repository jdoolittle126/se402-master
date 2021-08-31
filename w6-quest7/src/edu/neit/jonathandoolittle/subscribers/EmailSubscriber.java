package edu.neit.jonathandoolittle.subscribers;

import edu.neit.jonathandoolittle.news.ParsableNews;
import edu.neit.jonathandoolittle.publishing.BusinessNewsPublisher;
import edu.neit.jonathandoolittle.publishing.NewsPublisher;

/**
 * A subscriber who receives updates via email
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 30, 2021
 *
 */
public class EmailSubscriber implements Subscriber {

	// ******************************
	// Variables
	// ******************************
	
	private String emailAddress;

	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new EmailSubscriber instance
	 */
	public EmailSubscriber(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	// ******************************
	// Private methods
	// ******************************

	/**
	 * Mock sending an email
	 * @param header The subject of the email
	 * @param body The body of the email
	 */
	private void sendEmail(String header, String body) {
		System.out.println("YOU GOT MAIL!");
		System.out.println("\t|TO: You<" + emailAddress + ">");
		System.out.println("\t|FROM: Jon's Sometimes Interesting News Corp<jsinc@hotmail.com>");
		System.out.println("\t|SUBJECT: " + header);
		System.out.println("\t-------\n\t" + body.replaceAll("\n", "\n\t"));
		System.out.println();
	}

	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public void update(NewsPublisher publisher) {
		
		// This is how we handle business news
		if(publisher instanceof BusinessNewsPublisher) {
			// Email we want the headline as the subject, and the body as the content
			ParsableNews news = ((BusinessNewsPublisher) publisher).getLatestNews();
			sendEmail(news.getHeader(), news.getBody());
		}

	}
}
