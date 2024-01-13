package com.user.ums.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.user.ums.exception.UserNotFoundByIdException;

@RestControllerAdvice
public class ApplicationExceptionHandler {
	
	@Autowired
	private ErrorStructure<String> structure;
	
	@ExceptionHandler(UserNotFoundByIdException.class)
	public ResponseEntity<ErrorStructure<String>> handleUserNotFoundById(UserNotFoundByIdException exp) {
	    structure.setStstus(HttpStatus.NOT_FOUND.value());
	    structure.setMessage(exp.getMessage());
	    structure.setRootCause("The request user with the give Id is not Found");
		return new ResponseEntity<ErrorStructure<String>>(structure, HttpStatus.NOT_FOUND);
	}

}