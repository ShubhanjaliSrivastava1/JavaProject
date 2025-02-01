//overload the main method with diff arguments
package Java_project;

public class OverloadMainMethod 
{

	public static void main(String[] args) 
	{
		System.out.println("Main method");
		OverloadMainMethod a1=new OverloadMainMethod();
		a1.main();
		main("Ramu",'M');
		

	}
	public void main() //non static method   
	{
		System.out.println("Main method with no arguments");

	}
	public static void main(String name,char gender) //static method
	{
		System.out.println("Main method with argument as String and char");

	}

}
