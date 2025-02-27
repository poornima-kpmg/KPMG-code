package com.programming.class1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamWorking {
	
	public static void main(String[] args) {
		
		List<String> countries = new ArrayList<>();
		countries.add("India");
		countries.add("Japan");
		countries.add("China");
		
		Collections.sort(countries);
		
		for(String country : countries) {
			country = country.toUpperCase();
			if(!country.startsWith("J")) {
				System.out.println(country);
			}
		}
		
		//either you can create stream by using stream function on Collections object
		//like we have done above or we can create Stream like below one also
		
		countries.stream().map(s->s.toUpperCase()).filter
			(s->!s.startsWith("J")).sorted().forEach(s->System.out.println(s));
		
		Stream<String> fruitsStream = Stream.of("apple","orange","cherry","jack fruit");
		
		//System.out.println("print stream:" + fruitsStream.collect(Collectors.toList()));
		
		Predicate<String> noFruitWordFilter = name -> !name.contains("fruit");
		
		List<String> filteredStream = fruitsStream.filter( noFruitWordFilter).collect(Collectors.toList());
		
		System.out.println(filteredStream);
		
		
		//can use stream only once
	}

}
