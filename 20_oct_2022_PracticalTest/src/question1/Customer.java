package question1;


public class Customer {
private int accountNumber;
private String accountName;
private double accountBalance;
public Customer() {
	super();
}


 
public void createAccount(int accNumber,String accName,double accBalance) {
	this.accountBalance=accBalance;
	this.accountName=accName;
	this.accountNumber=accNumber;
}

public void setAmount(int amount) {
	this.accountBalance += amount;
}

public void withDrawnAmount(int withDrawnMoney) {
	this.accountBalance -= withDrawnMoney ;
}
 
public void getAmount() {
	System.out.println("Hello "+accountName+" your account balance is  "+accountBalance);
}
}

