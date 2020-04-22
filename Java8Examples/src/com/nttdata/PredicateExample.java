package com.nttdata;

import java.util.function.Predicate;

public class PredicateExample {
public static void main(String[] args) {

	Predicate<Integer > p=I->(I>10);
	System.out.println(p.test(20));
	Predicate< String> s1 =s->(s.length()>3);
	System.out.println(s1.test("he"));
	
	
}
}
