package br.com.ajf.learnjavadesignpatterns.decorator;

public final class Circle implements Shape
{
	@Override
	public void draw()
	{
		System.out.println("Shape Circle");
	}
}
