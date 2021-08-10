package edu.neit.jonathandoolittle;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import edu.neit.jonathandoolittle.builders.AlienBuilder;
import edu.neit.jonathandoolittle.builders.MartianAlienBuilder;
import edu.neit.jonathandoolittle.builders.NeptunianAlienBuilder;
import edu.neit.jonathandoolittle.builders.RandomAlienBuilder;

/**
 * 
 * Game is a class that creates the swing components for this
 * simple demo. Initializing Game will launch the window.
 *
 * <pre>
 *  Game game = new Game();
 * </pre>
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 9, 2021
 *
 */
public class Game {

	// ******************************
	// Variables
	// ******************************

	static final String GAME_NAME = "Alien Generator";
	
	// ******************************
	// Constructors
	// ******************************

	/**
	 * Creates a new Game instance
	 */
	public Game() {
		init();
	}

	// ******************************
	// Public methods
	// ******************************
	
	/**
	 * Builds the frames and event listeners for this game. This could be improved upon,
	 * but for the sake of time and the scope of this exercise, I am leaving it like this.
	 */
	public void init() {
		JFrame frame = new JFrame(GAME_NAME);
		JPanel panel = new JPanel();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(300,500);
	    AlienRenderer alienRenderer = new AlienRenderer();
	    JPanel buttonPanel = new JPanel();
	    JButton buttonCreateAlienNeptune = new JButton("Build an alien from Neptune!");
	    JButton buttonCreateAlienMars  = new JButton("Build an alien from Mars!");
	    JButton buttonCreateAlienRandom = new JButton("Build a random alien!"); 
	    
	    AlienBuilder martianAlienBuilder = new MartianAlienBuilder();
	    AlienBuilder neptunianAlienBuilder = new NeptunianAlienBuilder();
	    AlienBuilder randomAlienBuilder = new RandomAlienBuilder();
	    
	    buttonCreateAlienNeptune.addActionListener(l -> {
	    	alienRenderer.drawAlien(buildAlien(neptunianAlienBuilder));
	    });
	    
	    buttonCreateAlienMars.addActionListener(l -> {
	    	alienRenderer.drawAlien(buildAlien(martianAlienBuilder));
	    });
	    
	    buttonCreateAlienRandom.addActionListener(l -> {
	    	alienRenderer.drawAlien(buildAlien(randomAlienBuilder));
	    });
	    
	    buttonPanel.add(buttonCreateAlienNeptune);
	    buttonPanel.add(buttonCreateAlienMars);
	    buttonPanel.add(buttonCreateAlienRandom); 
	    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
	    
	    panel.add(buttonPanel);
	    panel.add(alienRenderer);
	    panel.add(Box.createVerticalGlue());
	    frame.add(panel);
	    frame.setVisible(true);
	}	
	
	// ******************************
	// Private methods
	// ******************************
	
	/**
	 * Makes an alien from the given builder
	 * @param builder The builder to use
	 * @return The alien
	 */
	private static Alien buildAlien(AlienBuilder builder) {
		builder.buildArms();
		builder.buildBody();
		builder.buildEars();
		builder.buildEyes();
		builder.buildFeet();
		builder.buildHead();
		builder.buildMouth();
		builder.buildNose();
		return builder.getAlien();
	}
	

}
