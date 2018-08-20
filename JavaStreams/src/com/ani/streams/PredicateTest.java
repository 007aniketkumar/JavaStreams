package com.ani.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.ani.data.Employee;

public class PredicateTest {

	public static void main(String[] args) {

		Employee e1 = new Employee("male", "aman","singh",1,23);
		Employee e2 = new Employee("male","amith","nanda",2,22);
		Employee e3 = new Employee("male","gyan","ranjan",3,22);
		Employee e4 = new Employee("male","satish","roy",4,18);
		Employee e5 = new Employee("female","priya","tripathi",5,32);
		Employee e6 = new Employee("female","neha","yadav",6,30);

		List<Employee> empList = new ArrayList<>();
		
		//Added all the items in the arraylist.
		empList.addAll(Arrays.asList(e1,e2,e3,e4,e5,e6));
		//empList.forEach(System.out::println);
		
		// All Employees who are male and age more than 21
		//in the above set only Aman is eligible.
		
			List<String> filterEmp  = empList.stream()
										.filter(employee -> "aman".equals(employee.getFirstName()) && 21< employee.getAge()).
										map(Employee->Employee.getFirstName()).
										collect(Collectors.toList());
			//print the list of employees
			
			filterEmp.forEach(System.out::println);
		

	}

}
