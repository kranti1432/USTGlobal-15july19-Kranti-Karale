package com.usttyspringboot.controller;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandle {

	@ExceptionHandler(Exception.class)
	public String catchException() {
		System.out.println("handle Exception");
	return "Handler Exception ";	
	}
}
