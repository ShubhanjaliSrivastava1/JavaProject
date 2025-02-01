package Java_project;

public class StaticMethodsOperators 
{
    static void addition()
    {
    	int a=102;
    	int b=100;
    	int sum=a+b;
    	System.out.println("The addition of two number is "+sum);
    }
    static void substraction()
    {
    	int a=102;
    	int b=100;
    	int sub=a-b;
    	System.out.println("The substarcation of two number is "+sub);
    }
    static void multiplication()
    {
    	int a=102;
    	int b=2;
    	int mul=a*b;
    	System.out.println("The Multiplication of two number is "+mul);
    }
    static void divide()
    {
    	int a=102;
    	int b=2;
    	int div=a/b;
    	System.out.println("The division of two number is "+div);
    }
    static void modulus()
    {
    	int a=102;
    	int b=20;
    	int mod=a%b;
    	System.out.println("The modulus of two number is "+mod);
    }
	public static void main(String[] args)
	{
		addition();
		substraction();
		multiplication();
		divide();
		modulus();
	}

}
