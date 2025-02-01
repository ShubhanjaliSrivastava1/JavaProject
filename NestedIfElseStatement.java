package Java_project;

public class NestedIfElseStatement 
{

	public static void main(String[] args) 
	{
		String gender1="Male";
		String gender2="Female";
		int age=10;
		
		if (gender1== "Male")
		{
			if (age>12)
			{
				System.out.println("Adult Fare");
			}
			else
			{
				System.out.println("Half fare");
			}
				
		
		}
		else
		{
			System.out.println("Free for female");
		}
		
		

	}

}
