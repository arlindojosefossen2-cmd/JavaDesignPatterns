package br.com.ajf.learnjavadesignpatterns.factory;

import br.com.ajf.learnjavadesignpatterns.abstractfactory.AbstractFactory;

public final class ShapeFactory extends AbstractFactory
{
	public static final int CIRCLE = 0;
	public static final int SQUARE = 1;
	public static final int RECTANGLE = 2;

	@Override
	public Shape getShape(int shapeType)
	{
		Shape[] shapes = new Shape[]
				{
						new Circle(),
						new Square(),
						new Rectangle()
				};
		return (shapeType > -1 && shapeType < shapes.length) ? shapes[shapeType] : shapes[0];
	}

	@Override
	public Color getColor(int colorType)
	{
		return new White();
	}
}
