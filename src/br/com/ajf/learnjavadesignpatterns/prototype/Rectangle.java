package br.com.ajf.learnjavadesignpatterns.prototype;

public final class Rectangle extends Shape
{
	public Rectangle()
	{
		super(Shape.RECTANGLE);
	}

	@Override
	void draw()
	{
		System.out.println("Rectangle");
	}
}
