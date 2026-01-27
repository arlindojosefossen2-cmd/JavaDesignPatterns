package br.com.ajf.learnjavadesignpatterns.facade;

public final class Rectangle implements Shape
{
	@Override
	public void draw()
	{
		System.out.println("Rectangle");
	}
}
