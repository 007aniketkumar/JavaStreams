/**
 * 
 */
package com.ani.streams;

/**
 * @author aniket
 *
 *
 *This method contains tests the default method functionality.
 *
 *
 */
public interface DefaultInterface {

	default void  parentMethod() {
		System.out.println("Method inside the default interface");
	}
	
	
	default void  additonalparentMethod() {
		System.out.println("Method inside the second default method  interface");
	}
	
	void tobeOverriden();
	
	}

