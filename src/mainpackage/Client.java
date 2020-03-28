package mainpackage;

import java.util.Random;

public class Client extends Users {
    int AFM;
    int PhoneNumber;


    public Client(String username, String name, String surname, String type, Boolean loggedin) {
        super(username, name, surname, type, loggedin);
        var user = new Users(username, name, surname, type, loggedin);
        setAFM();
        
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
