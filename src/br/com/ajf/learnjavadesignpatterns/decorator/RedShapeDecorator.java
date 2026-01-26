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
		setRedBorder(decoratorShape);
	}

	private void setRedBorder(Shape decoratorShape)
	{
		System.out.println("Shape border red");
	}
}
