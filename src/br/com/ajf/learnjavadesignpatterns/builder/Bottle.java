package br.com.ajf.learnjavadesignpatterns.builder;

public class Bottle implements Packing
{
	@Override
	public String pack()
	{
		return "Bottle";
	}
}
