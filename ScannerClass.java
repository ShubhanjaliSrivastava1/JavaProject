//Accepting Human input at run time
//Predefined class in java
//It is present in java,util package
//Syntax= create object of class called Scanner and pass the parameter called System.in
//Scanner s1=new Scanner(System.in);
//it doesn't have non parametrized constructor


package Java_project;

import java.util.Scanner;

public class ScannerClass 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner (System.in);
		System.out.println("Enter the value of a");
		int a=  s1.nextInt();
		System.out.println("Enter the value of b");
		int b=  s1.nextInt();
		int sum=a+b;
		System.out.println("sum of the two number is "+sum);


	}

}
