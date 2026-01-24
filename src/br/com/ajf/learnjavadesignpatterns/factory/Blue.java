package br.com.ajf.learnjavadesignpatterns.factory;

public final class Blue implements Color
{
	@Override
	public void fill()
	{
		System.out.println("Blue Color");
	}
}
