package question1.service;

import question1.model.Customer;

public class CustomerService {
      public boolean checkEligibility(Customer cust) {
    	 
    	  if(cust.getAge()>=18) {
    		 return true; 
    	  }
    	  
		return false;
      }
}
