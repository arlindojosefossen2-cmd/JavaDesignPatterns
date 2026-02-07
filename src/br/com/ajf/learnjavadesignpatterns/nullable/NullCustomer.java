package br.com.ajf.learnjavadesignpatterns.nullable;

public final class NullCustomer extends AbstractCustomer
{
	@Override
	boolean isNull()
	{
		return name == null || name.isBlank();
	}

	@Override
	String getName()
	{
		return isNull() ? "Nullable Customer" : name;
	}
}
