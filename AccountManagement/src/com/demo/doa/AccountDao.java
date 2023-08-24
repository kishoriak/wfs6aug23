package com.demo.doa;

import com.demo.beans.Account;
import com.demo.exceptions.AccountNotFoundException;
import com.demo.exceptions.InsufitientBalanceException;

public interface AccountDao {

	void save(Account acc);

	Account[] findall();

	Account findById(String id) throws AccountNotFoundException;

	void withdrawMoney(Account acc, double amt) 
			                   throws InsufitientBalanceException;

	

}
