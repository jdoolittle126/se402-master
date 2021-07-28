package edu.neit.jonathandoolittle;

public class ArrayDataStressTest {

	/**
	 * Test using mod
	 */
	public static void sumUsingMod(float[][] array) {
		float total = 0.0f;
		
		int l = array.length;
		int w = array[0].length;
		
		for(int i = 0; i < l*w ; i++) {
			total += array[i/w][i%w];
		}

	}

	/**
	 * Test using default double for
	 */
	public static void sumUsingDoubleFor(float[][] array) {
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
	public static void sumUsingModWithoutDivision(float[][] array) {
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
	public static void sumUsingBitwise(float[][] array) {
		float total = 0.0f;
		
		int l = array.length;
		int w = array[0].length;
		
		for(int i = 0; i < l*w ; i++) {
			total += array[i/w][i & (w-1)];
		}
	}
	
	/**
	 * Test w/o using division
	 */
	public static void sumUsingNoDivision(float[][] array) {
		float total = 0.0f;
		
		int l = array.length;
		int w = array[0].length;
		int r = 0;
		int c = 0;
		
		for(int i = 0; i < l*w ; i++) {
			total += array[c][r];
			
			if(r+1 == w) {
				c++;
				r = 0;
			} else {
				r++;
			}
		}
	}
	
	/**
	 * Test w/o using division using while
	 */
	public static void sumUsingNoDivisionWithWhile(float[][] array) {
		
		float total = 0.0f;
		int l = array.length;
		int w = array[0].length;
		int r = 0;
		int c = 0;
		
		while(true) {
			total += array[c][r];
			if(++r == w) {
				if(++c == l) 
					break;
				r = 0;
			}
		}
	}
}
