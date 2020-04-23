package com.nttdata.customException;

public class InsufficientAmount extends Exception {

	public InsufficientAmount(String message) {
		super(message);
	}
}
