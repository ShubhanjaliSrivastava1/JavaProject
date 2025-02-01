package Java_project;

public class StaticMethodOverLoading
{
	static void addition(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}

	static void addition(double a,double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	static void addition(double a,int b)
	{
		double sum=a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) 
	{
		addition(100,200);
		addition(4.33,3.74);
		addition(63.677,20);

	}

}
