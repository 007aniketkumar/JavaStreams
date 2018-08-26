/**
 * 
 */
package com.ani.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ani.data.Employee;

/**
 * @author aniket
 *
 */
public class MethodReferences {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Employee e1 = new Employee("male", "aman","singh",1,23);
		Employee e2 = new Employee("male","amith","nanda",2,22);
		Employee e3 = new Employee("male","gyan","ranjan",3,22);
		Employee e4 = new Employee("male","satish","roy",4,18);
		Employee e5 = new Employee("female","priya","tripathi",5,32);
		Employee e6 = new Employee("female","neha","yadav",6,30);
		
		List<Employee> empList = new ArrayList<>();
		empList.addAll(Arrays.asList(e1,e2,e3,e4,e5,e6));
		
		//using lambda
		empList.forEach(emp->emp.print(emp));
		
		//using method reference
		System.out.println("Using method references ");
		empList.forEach(Employee::print);
		
		
		
	}

}
