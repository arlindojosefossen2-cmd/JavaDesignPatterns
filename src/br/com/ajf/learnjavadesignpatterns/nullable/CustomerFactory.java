package br.com.ajf.learnjavadesignpatterns.nullable;

public final class CustomerFactory
{
	private CustomerFactory()
	{

	}

	public static String[] names = {
		"Bob",
		"Mary",
		"Ana",
		"Robert"
	};

	public static AbstractCustomer getCustomer(String name)
	{
		for (String s : names)
		{
			if (s.equalsIgnoreCase(name))
			{
				return new RealCustomer(name);
			}
		}
		return new NullCustomer();
	}
}
