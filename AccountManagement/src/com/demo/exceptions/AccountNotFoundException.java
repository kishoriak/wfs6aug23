package com.demo.exceptions;

public class AccountNotFoundException extends Exception {


public AccountNotFoundException(String msg) {
	super(msg);
}
public AccountNotFoundException(String msg,Throwable cause) {
	super(msg,cause);
}


}
