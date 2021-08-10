package edu.neit.jonathandoolittle;

import java.awt.Dimension;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import edu.neit.jonathandoolittle.parts.AlienPart;

/**
 * 
 * Renders an alien to the screen
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 9, 2021
 *
 */
public class AlienRenderer extends JPanel {

	// ******************************
	// Variables
	// ******************************
	
	private static final long serialVersionUID = 1L;
	private File path = new File("assets\\");
	private Alien alien;

	
	// ******************************
	// Public methods
	// ******************************

	/**
	 * Draws the given alien
	 * @param character The alien to draw
	 */
	public void drawAlien(Alien alien) {
		this.alien = alien;
		this.invalidate();
		this.repaint();
	}
	
	// ******************************
	// Overrides
	// ******************************
	
	@Override
	public void paint(Graphics arg0) {
		super.paint(arg0);
		
		if(alien != null) {
			
			List<AlienPart> parts = alien.getParts();
			try {
				for(AlienPart part : parts) {
					if(part != null) {
						arg0.drawImage(ImageIO.read(new File(path, part.getAssetUri() + ".png")), 0, 20, this);
					}
				}
				arg0.drawString(alien.getStats(), 20, 20);
				this.setSize(new Dimension(300, 300));
			} catch (IOException e) {
				System.out.println(e.getMessage());
				System.out.println(path.getAbsolutePath());
			}
			
		}	
	}
	
	
}
