package Java_project;

import java.util.Scanner;
public class SwitchCaseWithScannerClass
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter 1 for chrome");
		System.out.println("Please enter 2 for Edge");
		int input=s1.nextInt();
		
	
		switch(input)
		{
		case 1:
			
			System.out.println("Launching Chrome Browser");
			break;
			
		case 2:
			System.out.println("Launching Edge Browser");
			break;
			
		default:
			System.out.println("you have enterd wrong value");
		}	
			

	}

}
