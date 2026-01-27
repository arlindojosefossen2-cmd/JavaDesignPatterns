package br.com.ajf.learnjavadesignpatterns.flyweight;

public final class Circle implements Shape
{
	private final String color;
	private float x;
	private float y;
	private float radius;

	public Circle(String color)
	{
		this.color = color;
	}

	public void setX(float x)
	{
		this.x = x;
	}

	public void setY(float y)
	{
		this.y = y;
	}

	public void setRadius(float radius)
	{
		this.radius = radius;
	}

	@Override
	public void draw()
	{
		System.out.println(this.toString());
	}

	@Override
	public String toString()
	{
		return "Circle{" +
				"color='" + color + '\'' +
				", x=" + x +
				", y=" + y +
				", radius=" + radius +
				'}';
	}
}
