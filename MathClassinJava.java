package Java_project;

public class MathClassinJava
{

	public static void main(String[] args)
	{
		System.out.println(Math.addExact(100, 100));
		System.out.println(Math.addExact(20000000, 234555555));
		System.out.println(Math.subtractExact(200, 100));
		System.out.println(Math.multiplyExact(200, 300));
		System.out.println(Math.min(10, 8));
		System.out.println(Math.max(20, 40));
		System.out.println(Math.abs(-800));
		for (int i=1;i<=10;i++)
		{
			System.out.println(Math.random());
			
		}
		double pivalue=Math.PI;
		
		
		System.out.println(pivalue);
		double radious=Math.random();
		double area=pivalue*radious*radious;
		
		System.out.println(area);

	}

}
