package mainpackage;

public class Message {
	int From;
	int To;
	
	public Message(int from,int to) {
		From = from;
		To = to;
	}
	
	public void sentMessage(int f, int t, String text) {
		//TODO save message to db
		
		System.out.println(String.format("Number : %i send '%s' to: %i ", f, text, t));
		alterProgram(f);
	}
	
	static void alterProgram(int number) {
		//TODO increase message sent to this number
		System.out.println("Number:"+number+"send a message , increase its count");
	}
	
	public int getFrom() {
		return From;
	}
	public void setFrom(int from) {
		From = from;
	}
	public int getTo() {
		return To;
	}
	public void setTo(int to) {
		To = to;
	}
	

}
