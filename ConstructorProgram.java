//Constructor is always Non static
//Constructor name should be same as class name
//we can call constructor only by creating a object
//constructor have no return type

package Java_project;

public class ConstructorProgram 
{

	ConstructorProgram ()
	{
		System.out.println("Constructor");
	}
	public static void main(String[] args)
	{
		ConstructorProgram a1= new ConstructorProgram();//creating object syntax 1
		new ConstructorProgram();//creating object syntax 2
		new ConstructorProgram();
		new ConstructorProgram();
		new ConstructorProgram();
	}

}
