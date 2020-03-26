package mainpackage;

import java.util.ArrayList;

public class Seller extends Users {
   ArrayList<String> ClientNames = new ArrayList<String>();




    public Seller(String username, String name, String surname, String type, Boolean loggedin) {
        super(username, name, surname, type, loggedin);
        super.type = "Seller";
    }

    public void AddUser(String un, String n, String s) {
        var user = new Users(un, n, s, "Client", false);
        ClientNames.add(user.name);
    }

    public void BillIssue(String un) {
        //TODO create a struct for bills with client details
        return;
    }

    public void changePacckage(String un, String oldp, String newp) {
        //TODO get the package for the current user and change
    }

}
