package com.kart.Flip_Kart.exceptions;

public class OutOfStockException extends RuntimeException {
	public OutOfStockException(String message) {
        super(message);
    }
	public OutOfStockException(String message, Throwable cause) {
        super(message, cause);
    }
}
