package pkg;

import java.io.*;
import java.util.Scanner;

public class Game implements Serializable
{
	private int id;
	private String name;
	private int age;
	private long contact;
	
	public void play()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Id : ");
		id = sc.nextInt();
		
		System.out.print("Enter Name : ");
		name = sc.next();

		System.out.print("Enter Age : ");
		age = sc.nextInt();
		
		System.out.print("Enter Contact No. : ");
		contact = sc.nextLong();
		
		display_Data();
	}
	
	public void display_Data()
	{
		System.out.println("-------------------");
		System.out.println("| Id      : " + id	  	+ "    |");
		System.out.println("| Name    : " + name	+ "    |");
		System.out.println("| Age     : " + age	  	+ "    |");
		System.out.println("| Contact : " + contact + "    |" );
		System.out.println("-------------------");
	}
}
