package br.com.ajf.learnjavadesignpatterns.factory;

public final class Square implements Shape
{
	private float x;
	private float y;
	private float size;

	public Square()
	{

	}

	public Square(float x,float y,float size)
	{
		this.x = x;
		this.y = y;
		this.size = size;
	}

	@Override
	public void draw()
	{
		System.out.println(this);
	}

	public float getSize()
	{
		return size;
	}

	public void setSize(float size)
	{
		this.size = size;
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
		return "Square{" +
				"x=" + x +
				", y=" + y +
				", size=" + size +
				'}';
	}
}
