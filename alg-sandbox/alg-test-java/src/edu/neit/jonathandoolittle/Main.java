package edu.neit.jonathandoolittle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static final int RUNS = 1;
	
	public static void main(String[] args) {
		
		float[][] test = new float[10000][10000];
	
		try {
			testTime(ArrayDataStressTest.class, "sumUsingMod", test);
			testTime(ArrayDataStressTest.class, "sumUsingDoubleFor", test);
			testTime(ArrayDataStressTest.class, "sumUsingModWithoutDivision", test);
			testTime(ArrayDataStressTest.class, "sumUsingBitwise", test);
			testTime(ArrayDataStressTest.class, "sumUsingNoDivision", test);
			testTime(ArrayDataStressTest.class, "sumUsingNoDivisionWithWhile", test); // Winner :)
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
        
	}
	
	public static void testTime(Class methodClass, String methodName, float[][] data) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        long startTime = System.nanoTime();
        
		Method method = methodClass.getDeclaredMethod(methodName, float[][].class);
        
        for(int i=0; i < RUNS; i++){
        	method.invoke(null, data);
        }
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Method: " + methodName + " Total execution time: " + elapsedTime / 1000000 + "ms");
	}


	
}
