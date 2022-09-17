package com.sapient.week1.exception;

public class DataNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 2513827399095116642L;

	public DataNotFoundException(String msg) {
		super(msg);
	}
}
