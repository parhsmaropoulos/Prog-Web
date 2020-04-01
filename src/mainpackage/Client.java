package mainpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Client extends Users {
    int AFM;
    int PhoneNumber;
    List<Call> CallHistory = new ArrayList<Call>();
    List<Bill> Bills = new ArrayList<Bill>();
    List<Bill> CompletedBills = new ArrayList<Bill>();

    public Client(String username, String name, String surname) {
        super(username, name, surname, "Client");
    }
    
    public void GetDetails(Client us) {
    	printObject(us);
    }

    public void GetNumber() {
    	PhoneNumber Number = new PhoneNumber();
    	int number= Number.getPhoneNumber();
    	this.PhoneNumber = number;
    }
    
    public void MakeCall(int from, int to) {
        //TODO create call object and start a call
    	var call = new Call(from, to);
    	CallHistory.add(call);
    }
    
    public void ShowBills() {
        //TODO iterate through bills
    	if (Bills.size() > 0) {
    		System.out.print("Bills: \n"+ Bills.get(0).price);    		
    	}
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
    	if (CallHistory.size() > 0) {
	    	for(int i = 0; i < CallHistory.size(); i ++) {
	    		System.out.print("Call from :" + CallHistory.get(i).FromNumber + " to: " + CallHistory.get(i).ToNumber +"\n");
	    	}
    	}
    }

    public int getAFM() {
        return AFM;
    }

    public void setAFM() {
        //Generate a random AFM from 100000000 to 999999999
        int AFM = new Random().nextInt((999999999 - 100000000 + 1) + 100000000);
//        System.out.print("New AFM is :" + AFM +"\n");
        //TODO check if AFM exist
        this.AFM = AFM;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }
    public void printObject(Object object) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(object));
    }
}
