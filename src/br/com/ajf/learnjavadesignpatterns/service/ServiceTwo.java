package br.com.ajf.learnjavadesignpatterns.service;

public final class ServiceTwo implements Service
{
	@Override
	public String getName()
	{
		return "Service Two";
	}

	@Override
	public void execute()
	{
		System.out.println("Executing... Service Two");
	}
}
