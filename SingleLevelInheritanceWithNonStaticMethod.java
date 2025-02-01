package Java_project;
class one
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

public class SingleLevelInheritanceWithNonStaticMethod extends one
{
	void mul()
	{
		System.out.println("mul");
	}
	void div()
	{
		System.out.println("div");
	}

	public static void main(String[] args) 
	{
		SingleLevelInheritanceWithNonStaticMethod s1= new SingleLevelInheritanceWithNonStaticMethod();
		s1.mul();
		s1.div();
		s1.add();
		s1.sub();
		
		
	}

}
