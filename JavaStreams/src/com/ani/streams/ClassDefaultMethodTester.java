/**
 * 
 */
package com.ani.streams;

/**
 * @author aniket
 *
 */
public class ClassDefaultMethodTester implements DefaultInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DefaultInterface def =  new ClassDefaultMethodTester();
		def.additonalparentMethod();
		def.parentMethod();
		def.tobeOverriden();
		
	}

	@Override
	public void tobeOverriden() {
		
		System.out.println("overriden in child method");
	}
	
	
	//override the default implementation of second default method
	public void additonalparentMethod() {
		System.out.println(" addtional Method inside overriden class");
	
	}

}
