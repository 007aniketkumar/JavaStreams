/**
 * 
 */
package com.ani.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.ani.data.Product;

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
	
	static List<Product> productList = new ArrayList<>();

	
	public static void main(String[] args) {

		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		//finding all the numbers which are greater than 5. Restrict it to maximum 3 items
		numbers.stream().limit(3).filter(Integer-> Integer > 5).collect(Collectors.toList());
		
		
		//Working example - to add , find  , and delete products.
		
		//add products
		addProduct();
		//find product
		Product product = findProduct(1);
		System.out.println(product.getDescription());
		
		
	}

//Add pr	oduct
	static void addProduct() {
		 Product newproduct = new Product();
		 newproduct.setDescription("mobile");
		 newproduct.setPrice(1000);
		 newproduct.setProductID(1);
		 newproduct.setVersion(1);
		 
		 productList.add(newproduct);
		 
	}
	
	
	//Find a product based on product ID, This is different than finding a list of products.
	static Product findProduct(int productID) {
		
		return productList.stream().filter(product -> productID==product.getProductID()).
		findAny().orElse(null);
											  
		
	}
	
}
