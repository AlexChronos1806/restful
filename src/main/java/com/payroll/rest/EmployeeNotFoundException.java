package com.payroll.rest;

public class EmployeeNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6244178783675461947L;

	public EmployeeNotFoundException(Long id) {
		super("Could not find employee " + id);
	}
}
