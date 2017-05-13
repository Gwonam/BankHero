
public class Customer {
	private String name;
	private long idNr;
	private static int customerNrCount = 100;
	private int customerNr;
	
	
	public Customer(String name, long idNr) {
		this.name = name;
		this.idNr = idNr;
		customerNrCount++;
		customerNr = customerNrCount;
	}
	
	public String getName() {
		return name;
	}
	
	public long getIdNr() {
		return idNr;
	}
	
	public int getCustomerNr() {
		return customerNr;
	}
	
	public String toString() {
		return name + ", id " + idNr + ", kundnr " + this.customerNr;  
	}
}
