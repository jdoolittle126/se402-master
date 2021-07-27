package edu.neit.jonathandoolittle;

public class Main {

	public static void main(String[] args) {
		float[][] test = {
				{5.3f, 1f, 33.03f},
				{7f, 14f, 33.03f},
				{5.3f, 1f, 33.03f},
				{5.3f, 1f, 33.03f},
				{5.3f, 1f, 33.03f},
				{5.3f, 1f, 33.03f},
		};
		
		//10 mil runs each
        
        long startTime = System.nanoTime();
        for(int i=0; i< 10000000; i++){
        	sum(test);
        }
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time: " + elapsedTime/1000000 + "ms");
        
        startTime = System.nanoTime();
        for(int i=0; i< 10000000; i++){
        	sum2(test);
        }
        elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time: " + elapsedTime/1000000 + "ms");
        
        
        
        startTime = System.nanoTime();
        for(int i=0; i< 10000000; i++){
        	sum3(test);
        }
        elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time: " + elapsedTime/1000000 + "ms");
		
        startTime = System.nanoTime();
        for(int i=0; i< 10000000; i++){
        	sum4(test);
        }
        elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time: " + elapsedTime/1000000 + "ms");
        
	}

	/**
	 * Test using mod
	 */
	private static void sum(float[][] array) {
		float total = 0.0f;
		
		int l = array.length;
		int w = array[0].length;
		
		for(int i = 0; i < l*w ; i++) {
			total += array[i/w][i%w];
		}

	}


	/**
	 * Test using default double array
	 */
	private static void sum2(float[][] array) {
		float total = 0.0f;
		
		int l = array.length;
		int w = array[0].length;
		
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < w; j++) {
				total += array[i][j];
			}
		}

	}
	
	/**
	 * Test using mod w/o using division
	 */
	private static void sum3(float[][] array) {
		float total = 0.0f;
		
		int l = array.length;
		int w = array[0].length;
		int r = 0;
		int c = 0;
		
		for(int i = 0; i < l*w ; i++) {
			total += array[c][r];
			if(i % w == w-1) {
				c++;
				r = 0;
			} else {
				r++;
			}
		}
	}
	
	/**
	 * Test using bitwise
	 */
	private static void sum4(float[][] array) {
		float total = 0.0f;
		
		int l = array.length;
		int w = array[0].length;
		
		for(int i = 0; i < l*w ; i++) {
			total += array[i/w][i & (w-1)];
		}
	}
	
}
