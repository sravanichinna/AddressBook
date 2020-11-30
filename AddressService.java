package com.java.AddressBook;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class AddressService {
	ArrayList<InformationInput> book =new ArrayList<>();
	Scanner s = new Scanner(System.in);
	public void Add()
	
	{
		
		InformationInput Info = new InformationInput();
		System.out.println("Enter First name:");
		Info.setFirst(s.next());
		System.out.println("Enter last name:");
		Info.setLast(s.next());
		System.out.println("Enter your address:");
		Info.setAddress(s.next());
		System.out.println("Enter your city:");
		Info.setCity(s.next());
		System.out.println("Enter your state:");
		Info.setState(s.next());
		System.out.println("Enter your ZIP code:");
		Info.setZip(s.next());
		System.out.println("Enter your phone number");
		Info.setPhone(s.next());
		book.add(Info);
	}
	

	public void Delete()
	{
		String temp=null;
		System.out.println("Enter the Phone number of the record u want ot delete");
		temp=s.next();
		if(book.isEmpty())
		{
			System.out.println("No records to delete");
			return;
		}
		for(int i=0;i<book.size();i++)
		{
			if(book.get(i).getPhone().equals(temp))
			{
				book.remove(i);
				break;
			}
		}
	}
	
	public void Edit()
	{
		String temp=null;
		System.out.println("Enter the Phone number of the record u want to Edit");
		temp=s.next();
		if(book.isEmpty())
		{
			System.out.println("No records to edit");
			return;
		}
		
			for(int i=0;i<book.size();i++)
			{
				if(book.get(i).getPhone().equals(temp))
				{
					InformationInput Info=new InformationInput();
					System.out.println(temp);
					System.out.println("Enter First name:");
					Info.setFirst(s.next());
					System.out.println("Enter last name:");
					Info.setLast(s.next());
					System.out.println("Enter your address:");
					Info.setAddress(s.next());
					System.out.println("Enter your city:");
					Info.setCity(s.next());
					System.out.println("Enter your state:");
					Info.setState(s.next());
					System.out.println("Enter your ZIP code:");
					Info.setZip(s.next());
					System.out.println("Enter your phone number");
					Info.setPhone(s.next());
					book.remove(i);
					book.add(i, Info);
					break;
				}
				
			}
		
	}
	
	public void Sort_Zip()
	{
		ArrayList<String> Zip = new ArrayList<>();
		for(int i=0;i<book.size();i++)
		{
			Zip.add(book.get(i).getZip());
		}
		Collections.sort(Zip);
		System.out.println(Zip);
	}
	public void Sort_Name()
	{
		ArrayList<String> Name = new ArrayList<>();
		for(int i=0;i<book.size();i++)
		{
			Name.add(book.get(i).getLast());
		}
		Collections.sort(Name);
		System.out.println(Name);
	}
	public void Display()
	{
		for(int i=0;i<book.size();i++)
		{
			System.out.println(book.get(i));
		}
	}
	


}
