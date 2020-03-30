package mainpackage;

import java.util.List;

public class Bill {

//	int NumberOfCall = 1;
//	List<Call> Calls;
	String Month;
	int PhoneNumber;
	float price;
	


	public Bill(int PhoneNum, String month, float p) {
		this.Month = month;
		this.PhoneNumber = PhoneNum;
		this.price = p;
	}
	
//	public void addCall(Call call) {
//		this.Calls.add(call);
//	}
//	
	
	public float getPrice() {
		return price;
	}
	
	
	public void setPrice(float price) {
		this.price = price;
	}
//	public int getNumberOfCall() {
//		return NumberOfCall;
//	}
//	public void setNumberOfCall(int numberOfCall) {
//		NumberOfCall = numberOfCall;
//	}
//	public List<Call> getCalls() {
//		return Calls;
//	}
//	public void setCalls(List<Call> calls) {
//		Calls = calls;
//	}
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
