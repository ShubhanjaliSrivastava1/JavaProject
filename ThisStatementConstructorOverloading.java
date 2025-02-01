package Java_project;

public class ThisStatementConstructorOverloading 
{
	ThisStatementConstructorOverloading ()
	{
		this (100);
		System.out.println ("1st");
	}
	ThisStatementConstructorOverloading (int a)
	{
		this(10,20);
		System.out.println ("2nd");
	}
	ThisStatementConstructorOverloading (int a,int b)
	{
		this(100,"Shubh");
		System.out.println ("3rd");
	}
	ThisStatementConstructorOverloading (int a,String b)
	{
		
		System.out.println ("4th");
	}

	public static void main(String[] args) 
	{
		new ThisStatementConstructorOverloading();

	}

}
