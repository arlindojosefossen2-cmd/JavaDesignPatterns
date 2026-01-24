package br.com.ajf.learnjavadesignpatterns.builder;

public final class VegBurger extends Burger
{

	@Override
	public String name()
	{
		return "Veg Burger";
	}

	@Override
	public float price()
	{
		return 25.0f;
	}
}
