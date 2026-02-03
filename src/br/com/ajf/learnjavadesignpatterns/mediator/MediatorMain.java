package br.com.ajf.learnjavadesignpatterns.mediator;

public final class MediatorMain
{
	private MediatorMain()
	{

	}

	public static void main(String[] args)
	{
		System.out.println("Learn Java Design Patterns\nMediator\n");

		User john = new User("John");
		User mary = new User("Mary");

		john.senMessage("Hi! Mary!");
		mary.senMessage("Hello,John");
	}
}
