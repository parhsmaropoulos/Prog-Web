package mainpackage;

public class Users {
    String username;
    String name;
    String surname;
    String type;
    Boolean loggedin;

    static int userCounter;

    public Users(String username, String name, String surname, String type, Boolean loggedin) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.type = type;
        this.loggedin = loggedin;
    }

    public static void main(String[] args) {

        var user = new Users("parismaro", "parhs", "maro", "admin", false);
        var client = new Client(user.username, user.name, user.surname,user.type, user.loggedin);

    }


    public void LogIn (Boolean isLog) {
        //TODO check if un exits
        if (isLog == true) {
            System.out.println("Already logged in");
        } else {
           setLoggedin(true);
        }
        return;
    }

    public void LogOut(Boolean isLog) {
        if (isLog == false) {
            System.out.println("Already logged out");
        } else {
            setLoggedin(false);
        }
        return;
    }

    // Register the user with the input field to the db
    public void Register(String un, String n, String s, String t) {

        //TODO input validations
        System.out.println("User created successfully with the name : "+ n);

        //TODO input record to db
        userCounter++;
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
