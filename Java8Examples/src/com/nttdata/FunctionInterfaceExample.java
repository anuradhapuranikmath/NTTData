package com.nttdata;

import java.util.function.Function;

public class FunctionInterfaceExample {
public static void main(String[] args) {
	
	Function<String, Integer> function=s->(s.length());
	System.out.println(function.apply("hello"));  // take 2 aruguments first input second one return 
	
}
}
