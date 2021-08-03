package edu.neit.jonathandoolittle;

import java.util.ArrayList;
import java.util.List;

import edu.neit.jonathandoolittle.behaviors.FlyRocketPowered;
import edu.neit.jonathandoolittle.ducks.DecoyDuck;
import edu.neit.jonathandoolittle.ducks.Duck;
import edu.neit.jonathandoolittle.ducks.MallardDuck;
import edu.neit.jonathandoolittle.ducks.ModelDuck;
import edu.neit.jonathandoolittle.ducks.RedheadDuck;
import edu.neit.jonathandoolittle.ducks.RubberDuck;

/**
 * This program demonstrates how the strategy pattern can be used 
 * with a simple duck example!
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Jul 27, 2021
 *
 */
public class MiniDuckSimulator {

	public static void main(String[] args) {
		
		List<Duck> ducks = new ArrayList<>();
		
		ducks.add(new MallardDuck());
		ducks.add(new ModelDuck());
		ducks.add(new RubberDuck());
		ducks.add(new DecoyDuck());
		ducks.add(new RedheadDuck());
		
		for(Duck duck : ducks) {
			duck.display();
			duck.performFly();
			duck.performQuack();
			System.out.println();
		}
		
		ducks.get(0).display();
		ducks.get(0).setFlyBehavior(new FlyRocketPowered());
		ducks.get(0).performFly();
		
	}

}
