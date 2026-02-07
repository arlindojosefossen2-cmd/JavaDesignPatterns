package br.com.ajf.learnjavadesignpatterns.nullable;

public final class RealCustomer extends AbstractCustomer
{
	private final String name;

	public RealCustomer(String name)
	{
		this.name = name;
	}

	@Override
	boolean isNull()
	{
		return false;
	}

	@Override
	String getName()
	{
		return name;
	}
}
