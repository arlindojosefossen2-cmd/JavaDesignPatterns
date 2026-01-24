package br.com.ajf.learnjavadesignpatterns.factory;

public class EmptyShape implements Shape
{
	@Override
	public void draw()
	{
		System.out.println("Empty Shape");
	}
}
