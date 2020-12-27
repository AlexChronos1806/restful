package com.payroll.rest;

public class OrderNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8510047024319360341L;

	public OrderNotFoundException(Long id) {
		super("Could not find order " + id);
	}
}
