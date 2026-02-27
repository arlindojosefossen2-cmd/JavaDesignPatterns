package br.com.ajf.learnjavadesignpatterns.service;

public final class ServiceOne implements Service
{
	@Override
	public String getName()
	{
		return "Service One";
	}

	@Override
	public void execute()
	{
		System.out.println("Executing... Service One");
	}
}
