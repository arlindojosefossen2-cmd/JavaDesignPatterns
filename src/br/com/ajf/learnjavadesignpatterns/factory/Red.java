package br.com.ajf.learnjavadesignpatterns.factory;

public final class Red implements Color
{
	@Override
	public void fill()
	{
		System.out.println("Red Color");
	}
}
