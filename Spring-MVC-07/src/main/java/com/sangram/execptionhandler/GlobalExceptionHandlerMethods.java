package com.sangram.execptionhandler;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandlerMethods {

	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value=NullPointerException.class)
	public String handleNullPointerException(Exception e) {
		System.out.println("Null Pointer Exception occured "+e);
		return "nullPointerException";
	}
	@ResponseStatus(code=HttpStatus.CONFLICT)
	@ExceptionHandler(value=IOException.class)
	public String handleIOException(Exception e) {
		System.out.println("IO Exception occured "+e);
		return "IOException";
	}
	@ResponseStatus(code=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=Exception.class)
	public String handleException(Exception e) {
		System.out.println("Unknown Exception occured "+e);
		return "Exception";
	}
	
}
