package Java_project;

public class NonStaticMethodOverloading 
{
 
	 void addition(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}

	 void addition(double a,double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	 void addition(double a,int b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	static void addition(int a,double b)
		{
			double sum=a+b;
			System.out.println(sum);
		}
	static void addition(boolean b,String c,char d)
	{
		System.out.println("My name is "+c);
		System.out.println(b);
		System.out.println(d);
	}
	public static void main(String[] args)
	{
		NonStaticMethodOverloading a1 = new NonStaticMethodOverloading();
		a1.addition(20,20);
		a1.addition(1.23,1.55);
		a1.addition(1.344,22);
		addition(2,3.4444);
		addition(true, "Abhishek", 'N');

	}

}
