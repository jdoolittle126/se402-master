package edu.neit.jonathandoolittle;

/**
 * 
 * Driver for RoboGames Inc. robot sales
 * floor.
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Sep 21, 2021
 *
 */
public class RobotSalesCenter {

	
	public static void main(String[] args) {
		
		// Basic Robot
		System.out.println("Welcome to RoboGames Inc! Let's build you the perfect robot!");
		System.out.println("Just stucking with the base model? Sure we can do that! Coming right up!");
		Robot robot1 = new HumanoidRobot("George", "C3PO");
		System.out.println("Here you are: \n" + robot1);
		
		// Adding a Wheel
		System.out.println("Oh hi, welcome back! Your robot has no wheels and you need to carry him everywhere?");
		System.out.println("Not a problem, lets give him some wheels!");
		robot1 = new Wheel(robot1);
		System.out.println("Here you are: \n" + robot1);
		
		// Robot with Everything
		System.out.println("Hello, a new customer! Oh, you would like a robot with everything? Coming right up!");
		Robot robot2 = new HumanoidRobot("Jonathan", "ET");
		robot2 = new Wheel(robot2);
		robot2 = new Controller(robot2);
		robot2 = new Keyboard(robot2);
		robot2 = new Monitor(robot2);
		robot2 = new DiskDrive(robot2);
		
		System.out.println("Here you are: \n" + robot2);

	}
	
}
