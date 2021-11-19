package com.capgemini.exceptions;

public class NoSuchCustomerException extends Exception {
	private String message;
	public NoSuchCustomerException(String message) {
		super(message);
	}
}
