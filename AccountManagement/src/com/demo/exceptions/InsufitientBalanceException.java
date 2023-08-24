package com.demo.exceptions;

public class InsufitientBalanceException extends Exception {


public InsufitientBalanceException(String msg) {
	super(msg);
}
public InsufitientBalanceException(String msg,Throwable cause) {
	super(msg,cause);
}


}
