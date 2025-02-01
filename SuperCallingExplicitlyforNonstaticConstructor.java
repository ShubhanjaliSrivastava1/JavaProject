package Java_project;

class Reporting1 
{
	Reporting1(String a) //Parameterized Constructor
	{
		System.out.println("Reporting");
	}
}
class Screenshot1 extends Reporting1
{
	Screenshot1()//Nonparameterized constructor
	
	{
		super("Test"); //calling 1st parameterized constructor
		System.out.println("Screenshot");
	}
}
public class SuperCallingExplicitlyforNonstaticConstructor extends Screenshot1
{
	SuperCallingExplicitlyforNonstaticConstructor()
	{
		super(); //calling 2nd nonparametrized constructor
		System.out.println("Test Case");//3rd will execute
	}


	public static void main(String[] args) 
	{
		new SuperCallingExplicitlyforNonstaticConstructor();
	}

}
