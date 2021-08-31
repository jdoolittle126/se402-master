package edu.neit.jonathandoolittle.news;

/**
 * A simple interface to demonstrate how 
 * the articles may be organized. This interface, as well as the
 * {@link SimpleNewsArticle} class contain just a few components
 * that might make up an article, just to demonstrate. These simple
 * demonstrations are to show that the code is closed to modification,
 * but open to extension. 
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 30, 2021
 *
 */
public interface ParsableNews {
	
	/**
	 * @return The article's header
	 */
	public String getHeader();
	
	/**
	 * @return The article's body
	 */
	public String getBody();
	
}
