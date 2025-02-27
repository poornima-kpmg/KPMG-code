package com.programming.class1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingList {
	
	public static void main(String[] args) {
		
		List<String> items = new ArrayList<>();
		items.add("Tissue");
		items.add("Handwash");
		items.add("Bottle");
		
        List<String> sortedItems = items.stream()
            .sorted()
            .collect(Collectors.toList());
        
        System.out.println("Sorted items: " + sortedItems);
		
	}

}
