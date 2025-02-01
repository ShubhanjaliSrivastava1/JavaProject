package Java_project;
class Animal
{
	void eat()
	{
		System.out.println("This animal eats food.");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("the dogs barks.");
	}
}
class Cat extends Animal
{
	void meow()
	{
		System.out.println("the cats meows");
	}
}
public class HierchicalInheritance 
{

	public static void main(String[] args)
	{
		 Dog a=new Dog();
		 Cat b=new Cat();
		 System.out.println("Dog");
		 a.eat();
		 a.bark();
		 System.out.println("Cat");
		 b.eat();
		 b.meow();
		 
		 
		 
	}

}
