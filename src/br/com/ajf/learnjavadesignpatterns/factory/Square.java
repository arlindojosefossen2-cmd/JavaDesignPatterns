package br.com.ajf.learnjavadesignpatterns.factory;

public final class Square implements Shape
{
	public float x;
	public float y;
	public float size;

	public Square()
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
		return "Square{" +
				"x=" + x +
				", y=" + y +
				", size=" + size +
				'}';
	}
}
