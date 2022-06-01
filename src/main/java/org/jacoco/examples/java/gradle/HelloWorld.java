package org.jacoco.examples.java.gradle;

public class HelloWorld {
	
	public String getMessage(boolean bigger) {
		if (bigger) {
			return "Hello Universe!";
		} else {
			return "Hello World!";
		}
	}
	
	public static class Math {
		public int add(int x, int y){ return x+y; }
		public int subs(int x, int y){ return x-y; }
	}

}
