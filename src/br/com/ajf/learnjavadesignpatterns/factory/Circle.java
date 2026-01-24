package br.com.ajf.learnjavadesignpatterns.factory;

public final class Circle implements Shape
{
	public float x;
	public float y;
	public float radium;

	public Circle()
	{

	}

	@Override
	public void draw()
	{
		System.out.println(this);
	}

	@Override
	public String toString()
	{
		return "Circle{" +
				"x=" + x +
				", y=" + y +
				", radium=" + radium +
				'}';
	}
}
