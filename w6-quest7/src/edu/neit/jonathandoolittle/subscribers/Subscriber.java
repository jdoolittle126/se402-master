package edu.neit.jonathandoolittle.subscribers;

import edu.neit.jonathandoolittle.publishing.NewsPublisher;

/**
 * 
 * An entity that can observe {@link NewsPublisher}s,
 * allowing them to get news alerts.
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 30, 2021
 *
 */
public interface Subscriber {
	
	/**
	 * Updates the subscriber with the latest information
	 * @param publisher The publish that is updating this subsriber
	 */
	public void update(NewsPublisher publisher);

}
