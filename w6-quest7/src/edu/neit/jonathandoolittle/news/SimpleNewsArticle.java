package edu.neit.jonathandoolittle.news;

/**
 * 
 * A simple sample news article class to demonstrate how 
 * the articles may be organized. This class, as well as the
 * {@link ParsableNews} interface contain just a few components
 * that might make up an article, just to demonstrate. These simple
 * demonstrations are to show that the code is closed to modification,
 * but open to extension. 
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 30, 2021
 *
 */
public class SimpleNewsArticle implements ParsableNews {

	// ******************************
	// Variables
	// ******************************

	private String header;
	private String body;
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new SimpleNewsArticle instance
	 * @param header
	 * @param body
	 */
	public SimpleNewsArticle(String header, String body) {
		this.header = header;
		this.body = body;
	}
	
	// ******************************
	// Overrides
	// ******************************

	@Override
	public String getHeader() {
		return header;
	}

	@Override
	public String getBody() {
		return body;
	}
}
