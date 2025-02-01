package Java_project;
class Parent_class
{
 void login()
 {
	 System.out.println("login with email id");
 }
}

public class MethodOverridingInInheritance extends Parent_class
{
	void login()
	{
		System.out.println("login with mobile number");
		super.login();
	}


  public static void main(String[] args)
  
  {
	  MethodOverridingInInheritance a1 = new MethodOverridingInInheritance();
      a1.login();
  }
}

