package br.com.ajf.learnjavadesignpatterns.nullable;

public final class RealCustomer extends AbstractCustomer
{
	public RealCustomer(String name)
	{
		this.name = name;
	}

	@Override
	boolean isNull()
	{
		return name != null && !name.isBlank();
	}

	@Override
	String getName()
	{
		return isNull() ? name : "";
	}
}
