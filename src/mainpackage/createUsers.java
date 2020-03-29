package mainpackage;

public class createUsers {
	Users cl, ad, sel;
	
	public static void main(String[] args) {
		var client = new Client("Paris","Paris", "maropoulos", "Client");
		var admin = new Admin("mister", "admin", "is", "Admin");
		var seller = new Seller("miss", "seller", "isa", "Seller");
		
		client.setAFM();
		client.getAFM();
		int number = client.GetNumber();
		client.MakeCall(number, 123);
		
	}
}
