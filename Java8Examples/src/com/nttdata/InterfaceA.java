package com.nttdata;
@FunctionalInterface
public interface InterfaceA {

	 void foo();
	 default void print()
	 {
		 System.out.println(" i am default method ");
	 }
}
