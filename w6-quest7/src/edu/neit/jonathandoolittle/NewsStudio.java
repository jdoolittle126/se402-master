package edu.neit.jonathandoolittle;

import edu.neit.jonathandoolittle.news.SimpleNewsArticle;
import edu.neit.jonathandoolittle.publishing.BusinessNewsPublisher;
import edu.neit.jonathandoolittle.subscribers.EmailSubscriber;
import edu.neit.jonathandoolittle.subscribers.SmsSubscriber;

/**
 * 
 * Driver for quest 7
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 30, 2021
 *
 */
public class NewsStudio {

	public static void main(String[] args) {
		BusinessNewsPublisher jonsNews = new BusinessNewsPublisher();
		
		// Lets add some SMS Subscribers
		jonsNews.addSubscriber(new SmsSubscriber("(401) 123-4567"));
		jonsNews.addSubscriber(new SmsSubscriber("(401) 444-4444"));
		
		// And some email ones as well
		jonsNews.addSubscriber(new EmailSubscriber("jon@gmail.com"));
		jonsNews.addSubscriber(new EmailSubscriber("penguin_man7@yahoo.com"));
		
		
		// Lets make some news stories!
		SimpleNewsArticle article1 = new SimpleNewsArticle("How this Traveling Potato Salesman Retired at Just 43!", 
				"Kyle 'Spud' Smith, a traveling potato salesman, has just retired with over $4.6 million in \n"
				+ " savings! If you want to learn the industry secrets that Wall Street doesn't want you to hear,\n"
				+ " click >>>>HERE<<<<<!");
		
		SimpleNewsArticle article2 = new SimpleNewsArticle("Local Dog Barks at Mailman", 
				"\"bark bark!\" said Buster, a 4yo Saint Brenard, when asked to recall his proudest moment.\n"
				+ "While other dogs around the block applaud Buster for his heroic act, there are some who\n"
				+ "think the mailman is innocent. More on this tonight!");
		
		// Send out alerts
		jonsNews.sendNewsAlert(article1);
		jonsNews.sendNewsAlert(article2);

	}

}
