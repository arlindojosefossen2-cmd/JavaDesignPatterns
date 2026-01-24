package br.com.ajf.learnjavadesignpatterns.prototype;

public abstract class Shape implements Cloneable
{
	protected static final int CIRCLE = 0;
	protected static final int SQUARE = 1;
	protected static final int RECTANGLE = 2;

	public int id;
	public final int type;

	public Shape(int type)
	{
		this.type = type;
	}

	abstract void draw();

	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
