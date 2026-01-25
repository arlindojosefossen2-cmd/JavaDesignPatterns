package br.com.ajf.learnjavadesignpatterns.bridge;

public final class Circle extends Shape
{
	private float radium;
	private float x;
	private float y;

	public Circle(float x,float y,float radium,IDraw draw)
	{
		super(draw);
		this.x = x;
		this.y = y;
		this.radium = radium;
	}

	@Override
	public void draw()
	{
		draw.drawCircle(radium,x,y);
	}
}
