package com.nttdata;

import java.util.ArrayList;
import java.util.List;

public class StreamsIntermediateExamples {

	public static void main(String[] args) {
		
		
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		// intermediate methods return stream
		//filters example
		
		memberNames.stream().filter((s)->s.startsWith("A")).forEach(s->System.out.println(s));
		
		
		//map example
		
		memberNames.stream().map(String::toUpperCase).forEach(System.out::println);
		
		//sort example
		
		memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
		
		//Terminal operatiosn does not return streams 
		
		memberNames.forEach(System.out::println);
		
		//match function
		
		boolean b=memberNames.stream() .anyMatch(s->s.startsWith("A"));
		System.out.println(b);
		//count function
		
		long i=memberNames.stream().filter(s->s.startsWith("S")).count();
		System.out.println(i);
	}
	
	
}
