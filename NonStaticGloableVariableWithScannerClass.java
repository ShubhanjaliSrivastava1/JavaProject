package Java_project;

import java.util.Scanner;

public class NonStaticGloableVariableWithScannerClass  
{
	//non static Global Variable
	 int a;
     int b;
    
     public static void main(String[] args) 
	{
		Scanner a1=new Scanner(System.in);
		//create an instance of the class to access global variable
		NonStaticGloableVariableWithScannerClass b1=new NonStaticGloableVariableWithScannerClass();
		System.out.println("Enter the value of a");
		b1.a=a1.nextInt();
		System.out.println("Enter the value of b");
		b1.b=a1.nextInt();
		int c=b1.a+b1.b;
		System.out.println("The value of c (a+b) is : "+c);
		int d=b1.a-b1.b;
		System.out.println("The value of d (a-b) is:"+d);
		int e=b1.a*b1.b;
		System.out.println("The value of e(a*b) is:"+e);
		int f=b1.a/b1.b;
		System.out.println("The value of f (a/b) is:"+f);
		
		
		
		
     
	}

}
