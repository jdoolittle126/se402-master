package edu.neit.jonathandoolittle;

/**
 * 
 * Driver for quest 8
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 6, 2021
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Window window = new SimpleWindow(1920, 1080);
		
		window.draw();
		
		window = new HorizontalScrollBarDecorator(window);
		window.setWidth(10);
		window = new VerticalScrollBarDecorator(window);
		
		window.draw();
	}

}
