package br.com.ajf.learnjavadesignpatterns.service;

public final class InitialContext
{
	public Object lookup(String jndiName)
	{
		if(jndiName.equalsIgnoreCase("Service One"))
		{
			System.out.println("Looking up and creating a new Service One");
			return new ServiceOne();
		}
		else if(jndiName.equalsIgnoreCase("Service Two"))
		{
			System.out.println("Looking up and creating a new Service Two");
			return new ServiceTwo();
		}
		return null;
	}
}
