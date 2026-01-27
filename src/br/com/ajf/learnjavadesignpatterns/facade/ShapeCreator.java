package br.com.ajf.learnjavadesignpatterns.facade;

public final class ShapeCreator
{
	private final Shape circle;
	private final Shape rectangle;
	private final Shape square;

	public ShapeCreator()
	{
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}

	public void drawRectangle()
	{
		rectangle.draw();
	}
	public void drawSquare()
	{
		square.draw();
	}
	public void drawCircle()
	{
		circle.draw();
	}
}
