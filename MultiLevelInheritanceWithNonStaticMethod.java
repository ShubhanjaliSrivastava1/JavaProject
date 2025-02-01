package Java_project;

class Inheritance1
{
	void add()
	{
		System.out.println("add");
	}
	void sub()
	{
		System.out.println("sub");
	}
}

class Inheritance2 extends Inheritance1
{
	void mul()
	{
		System.out.println("mul");
	}
	void div()
	{
		System.out.println("div");
	}
}


public class MultiLevelInheritanceWithNonStaticMethod extends Inheritance2
{
		void min()
		{
			System.out.println("min");
		}
		void max()
		{
			System.out.println("max");
		}


	public static void main(String[] args) 
	{
		MultiLevelInheritanceWithNonStaticMethod s1=new MultiLevelInheritanceWithNonStaticMethod();
		s1.add();
		s1.sub();
		s1.mul();
		s1.div();
		s1.min();
		s1.max();
		

	}

}
