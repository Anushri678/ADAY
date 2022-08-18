package question1.view;

import question1.model.Customer;
import question1.service.CustomerService;

public class CustomerView {
     public static void main(String args[]) {
    	 Customer cust1 = new Customer(1,"Anu", 2);
    	 CustomerService custservice = new CustomerService();
    	 boolean eligible = custservice.checkEligibility(cust1);
    	 if(eligible == true) {
    		 System.out.println("You are eligible for voting");
    	 }
    	 else {
    		 System.out.println("You are not eligible for voting");
    	 }
    	 
     }
}
