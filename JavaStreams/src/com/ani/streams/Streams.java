/**
 * 
 */
package com.ani.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author aniket
 *
 */
public class Streams {

	/**
	 * @param args
	 */
	
	List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
	List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

	
	public static void main(String[] args) {

		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		
		numbers.stream().limit(3).filter(Integer-> Integer >5).collect(Collectors.toList());
		
		
		
	}

}
