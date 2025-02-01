package Java_project;

public class NonStaticMethodWIthOperators 
{
    void addition()
    {
    	int a=102;
    	int b=100;
    	int sum=a+b;
    	System.out.println("The addition of two number is "+sum);
    }
    void substraction()
    {
    	int a=102;
    	int b=100;
    	int sub=a-b;
    	System.out.println("The substarcation of two number is "+sub);
    }
    void multiplication()
    {
    	int a=102;
    	int b=2;
    	int mul=a*b;
    	System.out.println("The Multiplication of two number is "+mul);
    }
    void divide()
    {
    	int a=102;
    	int b=2;
    	int div=a/b;
    	System.out.println("The division of two number is "+div);
    }
    void modulus()
    {
    	int a=102;
    	int b=20;
    	int mod=a%b;
    	System.out.println("The modulus of two number is "+mod);
    }


	public static void main(String[] args) 
	{
		NonStaticMethodWIthOperators a1=new NonStaticMethodWIthOperators();
		a1.addition();
		a1.substraction();
		a1. multiplication();
		a1.divide();
		a1.modulus();
		
	}

}
