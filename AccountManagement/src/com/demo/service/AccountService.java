package com.demo.service;

import com.demo.beans.Account;
import com.demo.exceptions.AccountNotFoundException;
import com.demo.exceptions.InsufitientBalanceException;

public interface AccountService {

	void addnewAccount(int ch);

	Account[] getAll();

	Account getById(String id) throws AccountNotFoundException;

	boolean withdrawAmount(String id, double amt) throws AccountNotFoundException, InsufitientBalanceException;

}
