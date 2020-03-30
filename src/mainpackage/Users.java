package mainpackage;

public class Users {
    String username;
    String name;
    String surname;
    String type;
    Boolean loggedin;
    //TODO implement password

    static int userCounter;

    public Users(String username, String name, String surname, String type) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.type = type;
        this.Register(username, name, surname, type);
        
    }

    public static void main(String[] args) {
    }


    public void LogIn (String un, Boolean isLog) {
        //TODO check if un exits
        if (isLog == true) {
            System.out.println("Already logged in");
        } else {
            System.out.println(un + " logged in Successfully.");
           setLoggedin(true);
        }
        return;
    }

    public void LogOut(String un, Boolean isLog) {
        if (isLog == false) {
            System.out.println("There is no active user");
        } else {
            System.out.println(un + " logged out Successfully.");
            setLoggedin(false);
        }
        return;
    }

    // Register the user with the input field to the db
    public void Register(String un, String n, String s, String t) {
    	var con = new PsqlCon();
        //TODO input validations
        
        switch (t)
        {
        case "Client":
            System.out.println("Client created successfully with the name : "+ n);
            userCounter++;
            break;
        case "Admin":
            System.out.println("Admin created successfully with the name : "+ n);
            userCounter++;
            break;
        case "Seller":
            System.out.println("Seller created successfully with the name : "+ n);
            userCounter++;
            break;
        
        }

        //TODO input record to db
//        String query = String.format("Insert into users(username, name, surname, type, logged) "+
//        				"values('%s', '%s', '%s', '%s', %b)", un, n, s, t, false);
//        
//        con.addUser(query);
//        userCounter = con.getCounter();
        System.out.println("The new user Counter is: " + userCounter);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getLoggedin() {
        return loggedin;
    }

    public void setLoggedin(Boolean loggedin) {
        this.loggedin = loggedin;
    }
}
