package edu.neit.jonathandoolittle.publishing;

import edu.neit.jonathandoolittle.subscribers.Subscriber;

/**
 * Represents a generic news publisher, 
 * an observable entity that can push 
 * news alerts.
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 30, 2021
 *
 */
public interface NewsPublisher {
	
	/**
	 * Registers a {@link Subscriber} to this {@link NewsPublisher}
	 * @param subscriber The subscriber to register
	 */
	public void addSubscriber(Subscriber subscriber);
	
	/**
	 * Unlinks a {@link Subscriber} from this {@link NewsPublisher}
	 * @param subscriber The subscriber to register
	 */
	public void removeSubscriber(Subscriber subscriber);
	
	/**
	 * Marks this {@link NewsPublisher} as modified in some way.
	 */
	public void setChanged();
	
	/**
	 * Notify {@link Subscriber}s of a data change, if any
	 */
	public void notifySubscriber();
	

}
