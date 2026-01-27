package br.com.ajf.learnjavadesignpatterns.facade;

public final class Circle implements Shape
{
	@Override
	public void draw()
	{
		System.out.println("Circle");
	}
}
