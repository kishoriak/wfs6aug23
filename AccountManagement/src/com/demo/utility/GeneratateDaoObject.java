package com.demo.utility;

import com.demo.doa.AccountDao;
import com.demo.doa.AccountDaoImpl;

//factory pattern
public class GeneratateDaoObject {
   public static AccountDao getDaoImpl(int type) {
	   switch(type) {
	   case 1:
		   return new AccountDaoImpl(); //array as database
	   case 2:
		  // return new AccountDaoCollImpl();
		   
		   break;
	   case 3:
		 //  return new AccountDaoDBImpl();
		   break;
	   
   }
	   return null;
   }
}
