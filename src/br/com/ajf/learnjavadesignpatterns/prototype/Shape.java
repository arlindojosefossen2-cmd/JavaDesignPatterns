package br.com.ajf.learnjavadesignpatterns.prototype;

public abstract class Shape implements Cloneable
{
	protected static final int CIRCLE = 0;
	protected static final int SQUARE = 1;
	protected static final int RECTANGLE = 2;

	private int id;
	private int type;

	public Shape(int type)
	{
		this.type = type;
	}

	abstract void draw();

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getType()
	{
		return type;
	}

	@Override
	protected Object clone()
	{
		Object clone = null;

		try
		{
			clone = super.clone();
		}
		catch (CloneNotSupportedException ee)
		{
			ee.printStackTrace();
		}
		return clone;
	}
}
