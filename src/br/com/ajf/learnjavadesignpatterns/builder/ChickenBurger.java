package br.com.ajf.learnjavadesignpatterns.builder;

public final class ChickenBurger extends Burger
{

	@Override
	public String name()
	{
		return "Chicken Burger";
	}

	@Override
	public float price()
	{
		return 56.0f;
	}
}
