package com.demo.doa;

import com.demo.beans.Account;
import com.demo.beans.CurrentAccount;
import com.demo.beans.SavingAccount;
import com.demo.beans.User;

public class AccountDaoImpl implements AccountDao{
   private static Account[] accarr;
   private static int cnt;
   static {
	   accarr=new Account[100];
	   User[] u1={new User("xxxx","yyyy","1111","xx@xx"),null};
	   accarr[0]=new SavingAccount(u1,20000,"123456") ; 
	   User[] u2={new User("Rajan","Khadilkar","2222","rr@rr"),
			   new User("Revati","Khadilkar","333","rr11@rr")};
	   accarr[1]=new SavingAccount(u2,20000,"123456") ; 
	   User[] u3={new User("Atharva","Kulkarni","555","aa@aa"),
			   new User("Revati","Khadilkar","333","rr11@rr")};
	   accarr[2]=new CurrentAccount(u3,20000,111) ;
	   User[] u4={new User("Deepa","Joshi","444","dd@aa"),null};
	   accarr[3]=new CurrentAccount(u4,20000,12) ;
	   cnt=4;
   }
	@Override
	public void save(Account acc) {
		accarr[cnt]=acc;
		cnt++;
		
	}
	@Override
	public Account[] findall() {
		return accarr;
	}

}
