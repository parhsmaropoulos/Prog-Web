package mainpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client extends Users {
    int AFM;
    int PhoneNumber;
    List<Bill> Bills = new ArrayList<Bill>();
    List<Bill> CompletedBills = new ArrayList<Bill>();

    public Client(String username, String name, String surname, String type) {
        super(username, name, surname, type);
    }

    public int GetNumber() {
    	var Number = new PhoneNumber();
    	Number.getPhoneNumber();
    	System.out.print("phone number is:"+ Number.getPhoneNumber()+"\n");
    	return Number.getPhoneNumber();
    }
    
    public void MakeCall(int from, int to) {
        //TODO create call object and start a call
    	var call = new Call(from, to);
    }
    
    public void ShowBills() {
        //TODO iterate through bills
    	
    	System.out.print("Bills: \n"+ Bills.get(0).price);
    }

    public void ShowCompletedBills() {
        //TODO show completed bills
    	System.out.print("Completed bills : " + CompletedBills);
    }
    
    public void addBill(Bill bill) {
    	Bills.add(bill);
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
        System.out.print("New AFM is :" + AFM +"\n");
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
