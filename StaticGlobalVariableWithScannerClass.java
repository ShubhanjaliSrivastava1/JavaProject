package Java_project;

import java.util.Scanner;

public class StaticGlobalVariableWithScannerClass 
{
	static int a;
	static int b;
	

	public static void main(String[] args)
	{
	Scanner a1 = new Scanner(System.in);
	
	System.out.println("Enter the value of a");
	a= a1.nextInt();
	
	System.out.println("Enter the value of b");
	b=a1.nextInt();
	int c=a+b;
	System.out.println("Value of c (a+b) is :"+c);
	int d=a-b;
	System.out.println("Value of d (a-b) is :"+d);
	int e=a*b;
	System.out.println("Value of e (a*b) is :"+e);
	int f=a/b;
	System.out.println("Value of f (a/b) is : "+f);

	}

}
