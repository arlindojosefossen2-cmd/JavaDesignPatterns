package br.com.ajf.learnjavadesignpatterns.factory;

public final class Rectangle implements Shape
{
	public float x;
	public float y;
	public float width;
	public float height;

	public Rectangle()
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
		return "Rectangle{" +
				"x=" + x +
				", y=" + y +
				", width=" + width +
				", height=" + height +
				'}';
	}
}
