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
	}

	private static void showUsers(){
		for (int i = 0; i <usersList.size(); i++)
		{
			var user = usersList.get(i);
			System.out.println(user.username + " type: "+ user.type + "\n");
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
					System.out.println("1: Show Details.");
					System.out.println("2: Show Bills.");
					System.out.println("3: Make Call.");
					System.out.println("4: Show Call History.");
					System.out.println("5: Logout.");
					int clientchoice = Integer.parseInt(scan.nextLine());
					switch (clientchoice)
					{
						case 1:
							((Client)us).GetDetails((Client)us);
							break;
						case 2:
							((Client)us).ShowBills();
							break;
						case 3:
							int from = (((Client) us).getPhoneNumber());
							System.out.println("Please type the phone number you want to call : ");
							int to = Integer.parseInt(scan.nextLine());
							((Client)us).MakeCall(from, to);
							break;
						case 4:
							((Client)us).CallHistory();
						case 5:
							logged = false;
							break;
					}
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
							Users user = ((Admin)us).CreateUser();
							usersList.add(user);
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
					System.out.println("1: Create a user.");
					System.out.println("2: Bill a client.");
					System.out.println("3: Change a users program.");
					System.out.println("4: Logout.");
					int sellerchoice = Integer.parseInt(scan.nextLine());
					switch (sellerchoice)
					{
						case 1:
							Users user = ((Seller)us).AddUser();
							usersList.add(user);
							break;
						case 2:
//							((Seller)us).BillIssue(cl, month, price);
							break;
						case 3:
//							((Seller)us).changePackage(un, oldp, newp);
							break;
						case 4:
							logged = false;
							break;
					}
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
				client.GetNumber();
				System.out.println("Client with username " + un + " created successfully");
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
