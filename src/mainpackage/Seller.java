package mainpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Seller extends Users {
   ArrayList<String> ClientNames = new ArrayList<String>();




    public Seller(String username, String name, String surname) {
        super(username, name, surname, "Seller");
    }

    public Users AddUser() {
    	        Scanner scan = new Scanner(System.in);

    	        System.out.println("Fill in the fields to continue the registration!");

    	        System.out.println("Enter Username:");
    	        String un = scan.nextLine();  // Read user input

    	        System.out.println("Enter Name:");
    	        String n = scan.nextLine();  // Read user input

    	        System.out.println("Enter Surname:");
    	        String s = scan.nextLine();  // Read user input
    	        
    	        var client = new Client(un, n, s);
    	        
    	        return client;
    }

    public Bill BillIssue(Client cl, String month, float price) {
        //TODO create a struct for bills with client details
    	int phnum = cl.getPhoneNumber();
    	Bill bill = new Bill(phnum, month, price);
    	System.out.print("The bill for : "+ phnum+" for "+ month+ " is :" + price +"\n");
    	cl.addBill(bill);
        return bill;
    }

    public void changePackage(String un, String oldp, String newp) {
        //TODO get the package for the current user and change
    	
    }

}
