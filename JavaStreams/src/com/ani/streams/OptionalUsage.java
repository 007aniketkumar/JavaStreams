package com.ani.streams;

import java.util.Optional;

/*
 * 
 * Various permutation combinations of optional
 * 
 * 
 */
public class OptionalUsage {

	static int number1 = 10;
	static String name = null;
	static String name2 = "binny";
	
	
	
	public static void main(String[] args) {
	
		
		Optional<Integer> number = Optional.ofNullable(number1);
		Optional<Integer> numberOption2 = Optional.empty();//no value
		System.out.println(number.orElse(12));
		
		System.out.println(numberOption2.isPresent());//returns false //one step guard to null pointer.
		
		//let's try with using name which has been initialized to null
		
		Optional<String> nameOptionalTest = Optional.of(name2);
		System.out.println(nameOptionalTest.of(name));//trying to initialize the optional to null value , will throw a null pointer exception here.
	}
}
