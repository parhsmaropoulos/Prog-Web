package mainpackage;

public class Admin extends Users {

    public Admin(String username, String name, String surname, String type) {
        super(username, name, surname, type);
    }
    
    public static void main(String[] args) {
    	CreateUser("paris", "par", "mar", "Client");
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

    // Delete an existing User
    public void DeleteUser(String un, String type){
        //TODO delete user from db
    }

    // Creates new package
    public void CreatePackage(){
        //TODO create new package and add to db
    }

    public void DeletePackage(){
        //TODO delete a package from the db
    }
}
