package br.com.ajf.learnjavadesignpatterns.builder;

public final class Coke extends ColdDrink
{
	@Override
	public String name()
	{
		return "Coke";
	}

	@Override
	public float price()
	{
		return 15.7f;
	}
}
