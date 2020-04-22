package com.nttdata;

public class Calculator {

	
		public int operateBinary(int a, int b, IntegerMath op) {
		return op.operation(a, b);
		}
		public static void main(String... args) {
		Calculator myApp = new Calculator();
		IntegerMath addition = (a, b) -> a + b;
		IntegerMath subtraction = (a, b) -> a - b;
		System.out.println("40 + 2 = " + myApp.operateBinary(40, 2, addition));
		// Output 42
		System.out.println("20 – 10 = "+ myApp.operateBinary(20, 10, subtraction));
		// Output 10

	
	
}
}