package br.com.ajf.learnjavadesignpatterns.facade;

public final class Square implements Shape
{
	@Override
	public void draw()
	{
		System.out.println("Square");
	}
}
