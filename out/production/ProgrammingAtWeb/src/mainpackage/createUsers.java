package mainpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class createUsers {
	static List<Users>  usersList = new ArrayList<Users>();
	
	public static void main(String[] args) throws IOException {
		Boolean flag = true;
		Scanner scan = new Scanner(System.in);
		while (flag) {

		System.out.println("Welcome! Press the number of your choice to continue:");
		System.out.println("1: Register new user.");
		System.out.println("2: Log in with existing user.");
		System.out.println("3: Show the users.");
		System.out.println("0: Exit the program.");
		int choice = Integer.parseInt(scan.nextLine());  // Read user input
			switch (choice){
				case 1:
					Register();
					break;
				case 2:
					Users u = Login();
					if (u != null){
						LogInMenu(u);
					}
					break;
				case 3:
					showUsers();
					break;
				case 0:
					flag = false;
					break;
			}
		}


//		Bill bill = seller.BillIssue(client, "april", 20.50f);
//		client.ShowBills();
//
////		try {
////			admin.CreateProgram();
////		} catch (IOException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////
////		admin.ShowPrograms();
		
	}

	private static void showUsers(){
		for (int i = 0; i <usersList.size(); i++)
		{
			var user = usersList.get(i);
			System.out.println(user.username);
		}
	}

	private static Users Login(){
		Scanner scan = new Scanner(System.in);
		Boolean found = false;
		Users user = null;
		System.out.println("Enter your username: ");
		String un = scan.nextLine();

		for( int i = 0; i < usersList.size(); i++){
				user = usersList.get(i);
				if (user.username.equals(un)) {
					found = true;
			}
		}

		if (found)
		{
			System.out.println("Welcome back :" + un + "!");
		}else{
			System.out.println("There is no user with username: "+ un+ "\n Please try again");
		}
		return user;
	}

	private static void LogInMenu(Users us) throws IOException {
		Boolean logged = true;
		Scanner scan = new Scanner(System.in);
		while(logged)
		{
			System.out.println("This is the logged in menu choose your action:");
			switch (us.type){
				case "Client":
					break;
				case "Admin":
					System.out.println("1: Create a user.");
					System.out.println("2: Create a program.");
					System.out.println("3: Show programs.");
					System.out.println("4: Logout.");
					int choice = Integer.parseInt(scan.nextLine());
					switch (choice)
					{
						case 1:
							((Admin)us).CreateUser();
							break;
						case 2:
							((Admin)us).CreateProgram();
							break;
						case 3:
							((Admin)us).ShowPrograms();
							break;
						case 4:
							logged = false;
							break;
					}
					break;
				case "Seller":
					break;
			}
		}

	}

	private static void Register(){
		Scanner scan = new Scanner(System.in);
		Boolean flag = true;
		String t = null;

		System.out.println("Fill in the fields to continue the registration!");

		System.out.println("Enter Username:");
		String un = scan.nextLine();  // Read user input

		System.out.println("Enter Name:");
		String n = scan.nextLine();  // Read user input

		System.out.println("Enter Surname:");
		String s = scan.nextLine();  // Read user input

		while(flag)
		{
			System.out.println("Enter type(Client,Admin,Seller):");
			t = scan.nextLine();  // Read user input
			if (t.equals("Client") || t.equals("Admin") || t.equals("Seller")){
				flag = false;
			}
		}

		switch (t){
			case "Client":
				var client = new Client(un, n, s);
				client.setAFM();
				var AFM = client.getAFM();
				System.out.println("Client with username " + un + " created successfully and has AFM: " +  AFM);
				usersList.add(client);
				break;
			case "Admin":
				var admin = new Admin(un, n, s);
				System.out.println("Admin with username " + un + " created successfully.");
				usersList.add(admin);
				break;
			case "Seller":
				var seller = new Seller(un, n, s);
				System.out.println("Seller with username " + un + " created successfully.");
				usersList.add(seller);
				break;
		}
		return;
	}
}
