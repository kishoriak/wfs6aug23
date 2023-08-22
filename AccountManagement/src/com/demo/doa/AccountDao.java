package com.demo.doa;

import com.demo.beans.Account;

public interface AccountDao {

	void save(Account acc);

	Account[] findall();

}
