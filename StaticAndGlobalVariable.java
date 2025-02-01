package Java_project;

public class StaticAndGlobalVariable 
{

	static int a=100;//Global variable
	static double pi;
	int d=10;
	static byte age;//default value
	static short date;//default value
	static long whether;//default value
	static float number;//default value
	static char name;//default value
	static boolean answer;//default value
	static String value;//default value

	
	public static void main(String[] args)
	{
	int b=200;//local variable
	System.out.println(a+b);
	System.out.println(pi);
	StaticAndGlobalVariable a1=new StaticAndGlobalVariable();
	a1.d=30;//updating the value og global variable d
	System.out.println(a1.d);
	
	System.out.println(age);
	System.out.println(date);
	System.out.println(whether);
	System.out.println(number);
	System.out.println(name);
	System.out.println(answer);
	System.out.println(value);

	}

}
