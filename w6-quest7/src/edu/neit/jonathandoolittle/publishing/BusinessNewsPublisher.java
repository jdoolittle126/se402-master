package edu.neit.jonathandoolittle.publishing;

import java.util.ArrayList;

import edu.neit.jonathandoolittle.news.ParsableNews;
import edu.neit.jonathandoolittle.subscribers.Subscriber;

/**
 * 
 * A concert publisher for business news. Please note
 * for the sake of this quest, this publisher uses the
 * {@link ParsableNews} interface. In a real situation,
 * news articles would most likely be built with the
 * builder pattern, so the articles could have nodes
 * for various fields (Such as multiple authors, tags,
 * etc.)
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 30, 2021
 *
 */
public class BusinessNewsPublisher implements NewsPublisher {

	// ******************************
	// Variables
	// ******************************

	private ArrayList<Subscriber> subscribers;
	private ArrayList<ParsableNews> newsFeed;
	private boolean isChanged;
	
	// ******************************
	// Constructors
	// ******************************
	
	/**
	 * Creates a new BusinessNewsPublisher instance
	 */
	public BusinessNewsPublisher() {
		subscribers = new ArrayList<>();
		newsFeed = new ArrayList<>();
	}
	
	// ******************************
	// Public methods
	// ******************************
	
	/**
	 * Alerts all subscribers of a new article being added to 
	 * the feed
	 * @param news The article to add
	 */
	public void sendNewsAlert(ParsableNews news) {
		newsFeed.add(news);
		setChanged();
		notifySubscriber();
	}
	
	// ******************************
	// Public methods
	// ******************************
	
	/**
	 * Gets the last article added to the feed
	 * @return The article
	 */
	public ParsableNews getLatestNews() {
		return newsFeed.get(newsFeed.size()-1);
	}
	
	/**
	 * Gets the headline of the last article added to the feed
	 * @return The article
	 */
	public String getLatestNewsHeadline() {
		return newsFeed.get(newsFeed.size()-1).getHeader();
	}
	
	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public void addSubscriber(Subscriber subscriber) {
		subscribers.add(subscriber);
	}

	@Override
	public void removeSubscriber(Subscriber subscriber) {
		subscribers.remove(subscriber);
	}

	@Override
	public void setChanged() {
		isChanged = true;	
	}

	@Override
	public void notifySubscriber() {
		if(isChanged) {
			for(Subscriber subscriber : subscribers) {
				subscriber.update(this);
			}
			isChanged = false;
		}
	}
	
}
