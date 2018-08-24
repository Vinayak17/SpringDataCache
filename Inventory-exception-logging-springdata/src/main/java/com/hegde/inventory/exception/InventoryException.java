package com.hegde.inventory.exception;

public class InventoryException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4850369770555652556L;

	private String errorCode;

	public InventoryException(String errorCode) {
		super();
		this.errorCode = errorCode;
	}

	public InventoryException(String errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}

	public InventoryException(String errorCode, String message, Throwable e) {
		super(message, e);
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	
}
