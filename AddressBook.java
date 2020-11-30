package com.java.AddressBook;
import java.util.Scanner;


public class AddressBook {
	public static void main(String[] args) {
		int  input;
		int ans;
		AddressService obj=new AddressService();
		
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("1.Add a contact");
			System.out.println("2.Edit a contact");
			System.out.println("3.Delete a contact");
			System.out.println("4.Sort contact by zip");
			System.out.println("5.Sort contact by lastname");
			System.out.println("6.Display the contacts");
			input = s.nextInt();
			switch(input)
			{
			case 1:
				obj.Add();
				break;
			case 2:
				obj.Edit();
				break;
			case 3:
				obj.Delete();
				break;
			case 4:
				obj.Sort_Zip();
				break;
			case 5:
				obj.Sort_Name();
				break;
			case 6:
				obj.Display();
				break;
			default:System.out.println("Invalid option");
			}
			System.out.println("Do you want to continue?(0/1)");
			ans=s.nextInt();
		}while(ans==1);
		

		
	}

}
