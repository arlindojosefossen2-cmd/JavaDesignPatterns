package br.com.ajf.learnjavadesignpatterns.nullable;

public final class NullCustomer extends AbstractCustomer
{
	@Override
	boolean isNull()
	{
		return true;
	}

	@Override
	String getName()
	{
		return "Nullable Customer" ;
	}
}
