package com.capg.exceptionhandler;

public class ShowNotFoundException extends ResourceNotFoundException {

	private static final long serialVersionUID = 6012349844888361053L;

	public ShowNotFoundException(int keyValue) {
		super("Show", "show-id", keyValue);
	}

}
