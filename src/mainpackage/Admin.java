package mainpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Admin extends Users {
	
	List<Program> Programs = new ArrayList<Program>();

    public Admin(String username, String name, String surname, String type) {
        super(username, name, surname, type);
    }
    
    // Create a new User
    public static void CreateUser(String un, String n, String s, String type) {
        //TODO add user to db
        switch (type){
            case "Client":
                var client = new Client(un, n, s, type);
                client.Register(un, n, s, type);
                break;
            case  "Admin":
                var admin = new Admin(un, n, s, type);
                break;
            case "Seller":
                var seller = new Seller(un, n, s, type);
        }
    }
    
    // Print all progrm
    public void ShowPrograms() {
    	printObject(Programs.get(0));
    }
    
    // Delete an existing User
    public void DeleteUser(String un, String type){
        //TODO delete user from db
    }

    // Creates new package
    public void CreateProgram() throws IOException{
        //TODO create new package and add to db
    	Scanner scan = new Scanner(System.in);
    	
    	
    	System.out.println("Enter name:");
        String name = scan.nextLine();  // Read user input
        
        System.out.println("Enter number for free calls per month:");
        int FCPM = Integer.parseInt(scan.nextLine());  // Read user input
        
        System.out.println("Enter number for free messages per moth:");
        int FMPM = Integer.parseInt(scan.nextLine());  // Read user input
        
        System.out.println("Can client call abroad?");
        int CCA = Integer.parseInt(scan.nextLine());  // Read user input
        
        System.out.println("Enter price per month:");
        int PPMo = Integer.parseInt(scan.nextLine());  // Read user input
        
        System.out.println("Enter price per message: ");
        int PPMe = Integer.parseInt(scan.nextLine());  // Read user input
        
        System.out.println("Enter price per call:");
        int PPC = Integer.parseInt(scan.nextLine());  // Read user input
        
    	Program prog = new Program(name, FCPM, FMPM, CCA, PPMo, PPMe, PPC);
    	
    	Programs.add(prog);
    	
    }

    public void DeleteProgram(){
        //TODO delete a package from the db
    }
    
    public void printObject(Object object) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(object));
    }
}
