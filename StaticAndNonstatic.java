package Java_project;

public class StaticAndNonstatic {

	static void addition()
	{
		System.out.println("Adding 2 Numbers");
	}
	void Substraction()
	{
		System.out.println("Substraction of 2 Numbers");
	}
	public static void main(String[] args) 
	{
		System.out.println("My Main Methods");
		StaticAndNonstatic n1=new StaticAndNonstatic ();
		addition();
		n1.Substraction();
	}

}
