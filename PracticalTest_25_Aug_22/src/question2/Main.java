package question2;

public class Main {
    public static void main(String args[]) {
    	
    	Account account = new Account(1, "Anu");
    	Customer coustmer = new Customer(12, "Current account");
    	ICICI icici1 = new ICICI(coustmer, account);
    	SBI sbi1 = new SBI(coustmer, account);
    	System.out.println("Interest " + icici1.getICICIinterest());
    	System.out.println("Intrest Rate " + icici1.getInterestRate());
    	System.out.println("Withdrawal Limit " + icici1.getWithdrawalLimit());
    	RBI rbi = new RBI(coustmer, account);
    	System.out.println(rbi.c);
    	System.out.println(rbi.a);
    	
    }
}
