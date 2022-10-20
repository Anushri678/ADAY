package question1;

public class Main {
public static void main(String[] args) {
	Customer cust1 = new Customer();
	Customer cust2 = new Customer();

	
	cust1.createAccount(1, "Anu", 3000);
	cust1.getAmount();
	cust1.setAmount(1000);
	cust1.getAmount();
	cust1.withDrawnAmount(500);
	cust1.getAmount();
	
	
	cust2.createAccount(2, "Aniket", 4000);
	cust2.getAmount();
	cust2.setAmount(800);
	cust2.getAmount();
	cust2.withDrawnAmount(700);
	cust2.getAmount();
	
	
	
}
}
