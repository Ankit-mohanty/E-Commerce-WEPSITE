package com.kart.Flip_Kart.exceptions;

import jakarta.persistence.Entity;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;

@RestControllerAdvice
public class HandelException {

	@ExceptionHandler(NoResourceFoundException.class)
	public ProblemDetail handel( NoResourceFoundException e) {
        return ProblemDetail.forStatusAndDetail(
				HttpStatusCode.valueOf(404),e.getMessage());
    }

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ProblemDetail handel(MethodArgumentNotValidException e) {
        return ProblemDetail.forStatusAndDetail(
                HttpStatusCode.valueOf(400),e.getMessage());
    }

	@ExceptionHandler(OutOfStockException.class)
	public ProblemDetail handel(OutOfStockException ose){
		return ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(202),ose.getMessage());
	}
}
