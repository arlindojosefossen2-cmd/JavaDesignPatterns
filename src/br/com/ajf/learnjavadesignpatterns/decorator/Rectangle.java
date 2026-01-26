package br.com.ajf.learnjavadesignpatterns.decorator;

public final class Rectangle implements Shape
{
	@Override
	public void draw()
	{
		System.out.println("Shape Rectangle");
	}
}
