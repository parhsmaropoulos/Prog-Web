package mainpackage;

import java.io.IOException;

public class createUsers {
	Users cl, ad, sel;
	
	public static void main(String[] args) {
		var client = new Client("Paris","Paris", "maropoulos", "Client");
		var admin = new Admin("mister", "admin", "is", "Admin");
		var seller = new Seller("miss", "seller", "isa", "Seller");
		
		
		//TODO create a menu with options
		client.setAFM();
		int number = client.GetNumber();
		client.MakeCall(number, 123);
		
		Bill bill = seller.BillIssue(client, "april", 20.50f);
		client.ShowBills();
		
		client.LogIn(client.username, false);
		client.LogOut(client.username, true);
		admin.LogIn(admin.username, true);
		
//		try {
//			admin.CreateProgram();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		admin.ShowPrograms();
		
	}
}
