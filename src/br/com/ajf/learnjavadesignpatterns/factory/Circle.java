package br.com.ajf.learnjavadesignpatterns.factory;

public final class Circle implements Shape
{
	private float x;
	private float y;
	private float radium;

	public Circle()
	{

	}

	public Circle(float x, float y, float radium)
	{
		this.x = x;
		this.y = y;
		this.radium = radium;
	}

	@Override
	public void draw()
	{
		System.out.println(this);
	}

	public float getRadium()
	{
		return radium;
	}

	public void setRadium(float radium)
	{
		this.radium = radium;
	}

	public float getY()
	{
		return y;
	}

	public void setY(float y)
	{
		this.y = y;
	}

	public float getX()
	{
		return x;
	}

	public void setX(float x)
	{
		this.x = x;
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
