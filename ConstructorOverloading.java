package Java_project;

public class ConstructorOverloading 
{

	ConstructorOverloading()
	{
		System.out.println("Constructor1");

	}
	ConstructorOverloading(int a)//Variation in argument list
	{
		System.out.println("Constructor2");

	}
	ConstructorOverloading(int a, int b)//Variation in argument list
	{
		System.out.println("Constructor3");

	}
	public static void main(String[] args) 
	{
		new ConstructorOverloading();
		new ConstructorOverloading(500);
		ConstructorOverloading a1=new ConstructorOverloading(20,30);
			
		
	}

}
