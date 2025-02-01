//use to call parent class constructor from the child class constructor
//implisit supercalling : no need to write

package Java_project;

class Reporting
{
	Reporting()
	{
		System.out.println("Reporting");
	}
}
class Screenshot extends Reporting
{
	Screenshot()
	{
	System.out.println("Screenshot");
	}
}

public class SuperCallingStatement extends Screenshot
{
	SuperCallingStatement()
	{
		System.out.println("Test case");
	}

	public static void main(String[] args) 
	{
		new SuperCallingStatement();

	}

}
