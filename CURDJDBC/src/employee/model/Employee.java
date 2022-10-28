package employee.model;

public class Employee {
	private int id;
	 private String nameString;
	 private String mobileString;
	 private String addresss;
	 private String emailString;
	 private String departmentString;
	public Employee() {
		super();
	}
	public Employee(int id, String nameString, String mobileString, String addresss, String emailString,
			String departmentString) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.mobileString = mobileString;
		this.addresss = addresss;
		this.emailString = emailString;
		this.departmentString = departmentString;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getMobileString() {
		return mobileString;
	}
	public void setMobileString(String mobileString) {
		this.mobileString = mobileString;
	}
	public String getAddresss() {
		return addresss;
	}
	public void setAddresss(String addresss) {
		this.addresss = addresss;
	}
	public String getEmailString() {
		return emailString;
	}
	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}
	public String getDepartmentString() {
		return departmentString;
	}
	public void setDepartmentString(String departmentString) {
		this.departmentString = departmentString;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", nameString=" + nameString + ", mobileString=" + mobileString + ", addresss="
				+ addresss + ", emailString=" + emailString + ", departmentString=" + departmentString + "]";
	}
	 
}
