package com.cg.bms.ui;

import java.io.InputStream;
import java.util.Scanner;

import com.bg.bms.servise.Bmsservice;
import com.bg.bms.servise.BmsserviceImpl;
import com.cg.bms.expection.BmsExpection;
import com.cg.bms.model.Customers;
import com.cg.bms.model.Users;

public class Main {
	static Scanner scanner = null;
	static boolean flag = false;

	public static void main(String[] args) throws BmsExpection {
		System.out.println("*******Banking Management System********");
		do {
			scanner = new Scanner(System.in);

			System.out.println("Enter userid");
			int userId = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter password");
			String loginPassword = scanner.nextLine();

			Users users = new Users();
			users.setUserId(userId);;
			users.setPassword(loginPassword);

			Bmsservice bmsservice = new BmsserviceImpl();
			boolean result = bmsservice.validateUser(users.getUserId(), users.getPassword());
			
			if (result == true) {
				flag = true;
				System.out.println("1. create account");
				System.out.println("2. view transations");
				System.out.println("please select choice");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					/*To display to customer for creating account*/
					Customers  customers = new Customers();
					
					System.out.println("Enter your name");
					String name = scanner.nextLine();
					scanner.nextLine();
					System.out.println("Enter your email");
					String email = scanner.nextLine();
					System.out.println("enter the address");
					String address = scanner.nextLine();
					System.out.println("enter pancard");
					String pancard = scanner.nextLine();
					System.out.println("enter your accountBalance");
					Long accountBalance = scanner.nextLong();
					scanner.nextLine();
					System.out.println("enter your accounttype");
					String accountType = scanner.nextLine();
					
					customers.setCustomerName(name);
					customers.setEmail(email);
					customers.setAddress(address);
					customers.setPancard(pancard);
					customers.setAccountBalance(accountBalance);
					customers.setAccountType(accountType);
					
				   Long id = 	bmsservice.insertingCustomerData(customers);
				   System.out.println(id);
					
					
					

					break;
				case 2:
					
					System.out.println("please select date to view transaction details");
					
					
					

					break;

				default:
					break;
				}

			} else {
				System.err.println("please enter valid username and password");
			}

		} while (!flag);
	}
}
