package br.com.ajf.learnjavadesignpatterns.prototype;

public final class Square extends Shape
{
	public Square()
	{
		super(Shape.SQUARE);
	}

	@Override
	void draw()
	{
		System.out.println("Square");
	}
}
