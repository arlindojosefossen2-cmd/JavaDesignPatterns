package br.com.ajf.learnjavadesignpatterns.factory;

public final class Rectangle implements Shape
{
	private float x;
	private float y;
	private float width;
	private float height;

	public Rectangle()
	{

	}

	public Rectangle(float x, float y, float width, float height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw()
	{
		System.out.println(this);
	}

	public float getHeight()
	{
		return height;
	}

	public void setHeight(float height)
	{
		this.height = height;
	}

	public float getWidth()
	{
		return width;
	}

	public void setWidth(float width)
	{
		this.width = width;
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
		return "Rectangle{" +
				"x=" + x +
				", y=" + y +
				", width=" + width +
				", height=" + height +
				'}';
	}
}
