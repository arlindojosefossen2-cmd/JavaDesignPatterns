package br.com.ajf.learnjavadesignpatterns.singleton;

public final class SingletonMain
{
	private SingletonMain()
	{

	}

	public static void main(String[] args)
	{
		System.out.println("Learn Java Design Patterns");
		System.out.println("Singleton");

		SingletonObject instance = SingletonObject.getInstance();
		instance.show();
	}
}
