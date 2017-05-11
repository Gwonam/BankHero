
public class Customer {
	private String name;
	private long idNr;
	private static int customerNrCount = 1000;
	private int customerNr;
	
	
	public Customer(String name, long idNr) {
		this.name = name;
		this.idNr = idNr;
		customerNrCount++;
		customerNr = customerNrCount;
	}
	
	String getName() {
		return name;
	}
	
	long getIdNr() {
		return idNr;
	}
	
	int getCustomerNr() {
		return customerNr;
	}
	
	public String toString() {
		return name + ", id " + idNr + ", kundnr " + this.customerNr;  
	}
}
