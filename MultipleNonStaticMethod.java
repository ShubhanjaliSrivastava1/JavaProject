package Java_project;

public class MultipleNonStaticMethod 
{

        void addition ()
		{
			System.out.println("Adding 2 numbers");
		}
        void substraction ()
		{
			System.out.println("substraction 2 numbers");
		}
        void multiplication ()
		{
			System.out.println("multiplication 2 numbers");
		}
        static void div ()
		{
			System.out.println("div 2 numbers");
		}

		public static void main(String[] args) 
		{
			System.out.println("Adding 1 numbers");
			MultipleNonStaticMethod n1=new MultipleNonStaticMethod();
			n1.addition();
			n1.substraction();
			n1.multiplication();
		    div();
		}

	}


