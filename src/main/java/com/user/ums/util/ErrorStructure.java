package com.user.ums.util;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class ErrorStructure<T> {
	
	private int ststus;
	private String message;
	private T rootCause;

}
