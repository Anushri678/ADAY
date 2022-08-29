package question2;

public class Customer {
    private int custmoerId;
    private String customerName;
    
    @Override
	public String toString() {
		return "Customer [custmoerId=" + custmoerId + ", customerName=" + customerName + "]";
	}

	public int getCustmoerId() {
		return custmoerId;
	}

	public void setCustmoerId(int custmoerId) {
		this.custmoerId = custmoerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Customer(int custmoerId, String customerName) {
		super();
		this.custmoerId = custmoerId;
		this.customerName = customerName;
	}

	public void getCustomerinfo() {
    	
    }
    
}
