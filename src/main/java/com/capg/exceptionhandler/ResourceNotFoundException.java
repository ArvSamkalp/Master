package com.capg.exceptionhandler;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -2490177539255980480L;

	public ResourceNotFoundException(String resourceType, String keyName, int keyValue) {
		super(resourceType + " with " + keyName + "[" + keyValue + "] not found in the system!");
		
	}

}
