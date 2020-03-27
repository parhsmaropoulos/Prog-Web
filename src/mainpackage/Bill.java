package mainpackage;

import java.util.List;

public class Bill {

	int NumberOfCall;
	List<Call> Calls;
	String Month;
	int PhoneNumber;
	int price;
	


	public Bill(int PhoneNum, String month, int p) {
		Month = month;
		PhoneNumber = PhoneNum;
		price = p;
	}
	
	
	public void addCall(Call call) {
		this.Calls.add(call);
	}
	
	
	public int getPrice() {
		return price;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumberOfCall() {
		return NumberOfCall;
	}
	public void setNumberOfCall(int numberOfCall) {
		NumberOfCall = numberOfCall;
	}
	public List<Call> getCalls() {
		return Calls;
	}
	public void setCalls(List<Call> calls) {
		Calls = calls;
	}
	public String getMonth() {
		return Month;
	}
	public void setMonth(String month) {
		Month = month;
	}
	public int getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
	
	
	
	
	
}
