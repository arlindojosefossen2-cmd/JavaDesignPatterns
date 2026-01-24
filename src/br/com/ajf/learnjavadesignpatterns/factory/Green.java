package br.com.ajf.learnjavadesignpatterns.factory;

public final class Green implements Color
{
	@Override
	public void fill()
	{
		System.out.println("Green Color");
	}
}
