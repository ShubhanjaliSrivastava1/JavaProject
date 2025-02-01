package Java_project;

class Class3
{
	static void add()
	{
		System.out.println("add");
	}
	static void sub()
	{
		System.out.println("sub");
	}
}
class Class2 extends Class3
{
	static void mul()
	{
		System.out.println("mul");
	}
	static void div()
	{
		System.out.println("div");
	}
}	

public class MultiLevelInheritancewithStaticMethods extends Class2
{
	static void min()
	{
		System.out.println("min");
	}
	static void max()
	{
		System.out.println("max");
	}


	public static void main(String[] args) 
	{
		
		    min();
		    max();
			add();
			sub();
			mul();
			div();
			

	}
}	



