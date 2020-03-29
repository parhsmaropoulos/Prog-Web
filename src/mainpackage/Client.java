package mainpackage;

import java.util.Random;

public class Client extends Users {
    int AFM;
    int PhoneNumber;


    public Client(String username, String name, String surname, String type) {
        super(username, name, surname, type);
    }

    public int GetNumber() {
    	var Number = new PhoneNumber();
    	Number.getPhoneNumber();
    	System.out.print("phone number is:"+ Number.getPhoneNumber());
    	return Number.getPhoneNumber();
    }
    
    public void MakeCall(int from, int to) {
        //TODO create call object and start a call
    	var call = new Call(from, to);
    }
    
    public void ShowBills() {
        //TODO show bills
    }

    public void ShowCompletedBills() {
        //TODO show completed bills
    }

    public void ShowUnCompletedBills() {
        //TODO show uncompleted bills
    }

    public void CallHistory() {
        //TODO show call history
    }

    public int getAFM() {
        return AFM;
    }

    public void setAFM() {
        //Generate a random AFM from 100000000 to 999999999
        int AFM = new Random().nextInt((999999999 - 100000000 + 1) + 100000000);
        //TODO check if AFM exist
        this.AFM = AFM;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
