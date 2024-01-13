package com.user.ums.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserNotFoundByIdException extends RuntimeException {
	
	private String message;
	
	@Override
	public String getMessage() {
		return message;
	}

}
