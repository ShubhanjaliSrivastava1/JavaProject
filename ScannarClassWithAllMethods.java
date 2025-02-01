package Java_project;

import java.util.Scanner;

public class ScannarClassWithAllMethods 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter your name ");
		String Fistname= s1.next();
		System.out.println("Are you graduate? ");
		Boolean b1=s1.nextBoolean();
		System.out.println("Enter you age");
		Byte b2=s1.nextByte();
		s1.close();
	
		
	}

}

