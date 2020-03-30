package mainpackage;

import java.util.ArrayList;

public class Seller extends Users {
   ArrayList<String> ClientNames = new ArrayList<String>();




    public Seller(String username, String name, String surname, String type) {
        super(username, name, surname, type);
        super.type = "Seller";
    }

    public void AddUser(String un, String n, String s) {
        var user = new Users(un, n, s, "Client");
        ClientNames.add(user.name);
    }

    public Bill BillIssue(Client cl, String month, float price) {
        //TODO create a struct for bills with client details
    	var phnum = cl.GetNumber();
    	Bill bill = new Bill(phnum, month, price);
    	System.out.print("The bill for : "+ phnum+" for "+ month+ " is :" + price +"\n");
    	cl.addBill(bill);
        return bill;
    }

    public void changePacckage(String un, String oldp, String newp) {
        //TODO get the package for the current user and change
    }

}
