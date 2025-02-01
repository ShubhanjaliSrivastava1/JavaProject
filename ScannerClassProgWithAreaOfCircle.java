package Java_project;

import java.util.Scanner;

public class ScannerClassProgWithAreaOfCircle 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of Pi");
		double pi= s1.nextDouble();
		
		System.out.println("Enter the value of radious");
		double r= s1.nextDouble();
		
		double area=pi*r*r;
		System.out.println("Total area is "+area);
		
		
	}

	
}
