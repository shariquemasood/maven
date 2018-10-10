package com.javacodegeeks;

/**
 * Author: Stathis
 *
 */
public class App {
	
	public String reverseString(String src) {
		return new StringBuilder(src).reverse().toString();
	}
	
    public static void main(String[] args) {
    	final String str = "Hello!";
    	
        App appObject = new App();
        System.out.println("The reverse string of \"" + str + "\" is \"" + appObject.reverseString(str) + "\"");
    }
}
