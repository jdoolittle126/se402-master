package edu.neit.jonathandoolittle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Driver for quest 4
 *
 * @author Jonathan Doolittle
 * @version 0.1 - Aug 9, 2021
 *
 */
public class Main {

	public static void main(String[] args) {
		
		// Test a bit of thread safety		
		System.out.println("Testing thread saftey. Both memory addresses should be the same. This isn't a definitive test, just an example.");
		
        Thread test = new Thread(() -> {
            System.out.println("Thread "+ JLogger.getLogger().toString());
        });
        
        test.start();
        System.out.println("Non-Thread " + JLogger.getLogger().toString());
        try {
			test.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
        // Test pushing to console and file
        System.out.println("\nTesting multiple output streams.");
        
		JLogger j = JLogger.getLogger();

		File outputFile = new File("testing.txt");
		
		try {
			j.addStream(new FileOutputStream(outputFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		j.log("We should now be logging to the console and to testing.txt! Lets log some stuff!");
		j.log("Lets log our logger!");
		j.log(j);
		
	}
}
