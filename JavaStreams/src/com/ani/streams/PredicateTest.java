package com.ani.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.ani.data.Employee;



/*
 * 
 * Predicate provides a basic filter criteria.
 * 
 * 
 * The format is  Predicate<T> nameofTheFunction  {
 * 
 * return T->T some filter;
 *
 * 
 * 
 * 
 */
public class PredicateTest {

	static List<Employee> empList = new ArrayList<>();

	public static void main(String[] args) {

		Employee e1 = new Employee("male", "aman","singh",1,23);
		Employee e2 = new Employee("male","amith","nanda",2,22);
		Employee e3 = new Employee("male","gyan","ranjan",3,22);
		Employee e4 = new Employee("male","satish","roy",4,18);
		Employee e5 = new Employee("female","priya","tripathi",5,32);
		Employee e6 = new Employee("female","neha","yadav",6,30);

		
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
		
			
			
			/*
			 * Pass the predicate function as filter to another function
			 * 
			 *  
			 * In the below function the femaleGreaterThan18 is a predicate , which is passed 
			 * as a parameter to filterFunction method.
			 * 
			 * 
			 */
			
		PredicateTest obj = new PredicateTest();
			
		(obj.filterFuntion(femaleGreaterThan18())).
		forEach(Employee->System.out.println(Employee.getFirstName()));
					

	}

	/*
	 * 
	 * Create a function which filters out all the female employees having 
	 * age >20
	 * 
	 * 
	 */
	
	
	static Predicate <Employee> femaleGreaterThan18() {
		System.out.println("Calling the predicate to filter the females grater than age of 18");
		return emp->emp.getGender().equalsIgnoreCase("female") && emp.getAge()>18;
	}
	
	
	
	/*
	 * 
	 * Create a filter to find all the female employee
	 * 
	 * 
	 */
	
	Predicate<Employee> idsOfFemale() {
		
		return emply-> emply.getGender().equalsIgnoreCase("F");
	}
	
	
	/*
	 * 
	 * Generic function which filters employees based on naming criteria.
	 * 
	 * 
	 */
	
	Predicate<Employee> specificCriteria(String criteria) {
		return emp->criteria.equalsIgnoreCase(emp.getFirstName());
	}
	
	
	
	/*
	 * A generic function which return the stream of employees based on the predicate
	 * 
	 * 
	 */
	Stream <Employee> filterFuntion(Predicate<Employee> p) {
		
		return empList.stream().filter(p);
	}
}
