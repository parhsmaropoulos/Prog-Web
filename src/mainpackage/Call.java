package mainpackage;

public class Call {
	
	int Time;
	int FromNumber;
	int ToNumber;
	
	
	
	public Call(int time, int fromNumber, int toNumber) {
		super();
		Time = time;
		FromNumber = fromNumber;
		ToNumber = toNumber;
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
