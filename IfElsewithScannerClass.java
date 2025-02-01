package Java_project;

import java.util.Scanner;

public class IfElsewithScannerClass 
{

	public static void main(String[] args)
	{
		Scanner a1=new Scanner (System.in);
		System.out.println("Enter the age of person");
		int ageofperson = a1.nextInt();
		if (ageofperson>=18)
		{
			System.out.println("You are eligible for vote");
		}
		else
		{
			System.out.println("You are not eligible for vote");
		}
	}

}
