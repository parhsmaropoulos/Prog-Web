package mainpackage;

public class Call {
	
	int Time;
	int FromNumber;
	int ToNumber;
	
	
	
	public Call(int fromNumber, int toNumber) {
		this.FromNumber = fromNumber;
		this.ToNumber = toNumber;
		makeCall(FromNumber, ToNumber);
	}
	
	public void makeCall(int f, int t) {
		//TODO save call to db
		//TODO check if can call free
		System.out.println(String.format("Number: %d called number: %d",f,t));
		alterProgram(f);
	}
	
	static void alterProgram(int number) {
		//TODO increase calls done by this number
		System.out.println("Number:"+number+" made a call , increase its count");
	}
	
	
	public int getTime() {
		return Time;
	}
	public void setTime(int time) {
		Time = time;
	}
	public int getFromNumber() {
		return FromNumber;
	}
	public void setFromNumber(int fromNumber) {
		FromNumber = fromNumber;
	}
	public int getToNumber() {
		return ToNumber;
	}
	public void setToNumber(int toNumber) {
		ToNumber = toNumber;
	}
	
	

}
