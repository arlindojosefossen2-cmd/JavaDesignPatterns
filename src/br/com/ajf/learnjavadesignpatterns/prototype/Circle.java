package br.com.ajf.learnjavadesignpatterns.prototype;

public final class Circle extends Shape
{
	public Circle()
	{
		super(Shape.CIRCLE);
	}

	@Override
	void draw()
	{
		System.out.println("Circle");
	}
}
