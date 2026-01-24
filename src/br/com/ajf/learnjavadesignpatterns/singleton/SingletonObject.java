package br.com.ajf.learnjavadesignpatterns.singleton;

public final class SingletonObject
{
	private static final SingletonObject instance = new SingletonObject();

	private SingletonObject()
	{

	}

	public static SingletonObject getInstance()
	{
		return instance;
	}

	public void show()
	{
		System.out.println(this);
	}

	@Override
	public String toString()
	{
		return "SingletonObject{}";
	}
}
