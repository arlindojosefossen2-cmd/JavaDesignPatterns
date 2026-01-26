package br.com.ajf.learnjavadesignpatterns.decorator;

public final class RedShapeDecorator extends ShapeDecorator
{
	public RedShapeDecorator(Shape decoratorShape)
	{
		super(decoratorShape);
	}

	@Override
	public void draw()
	{
		super.draw();
		setRedBorder();
	}

	private void setRedBorder()
	{
		System.out.println("Red Border");
	}
}
