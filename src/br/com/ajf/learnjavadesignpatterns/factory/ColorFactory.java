package br.com.ajf.learnjavadesignpatterns.factory;

import br.com.ajf.learnjavadesignpatterns.abstractfactory.AbstractFactory;

public final class ColorFactory extends AbstractFactory
{
	public static final int RED = 0;
	public static final int BLUE = 1;
	public static final int GREEN = 2;

	@Override
	public Shape getShape(int shapeType)
	{
		return new EmptyShape();
	}

	@Override
	public Color getColor(int colorType)
	{
		Color[] colors = new Color[]
				{
						new Red(),
						new Blue(),
						new Green()
			 	};
		return (colorType > -1 && colorType < colors.length) ? colors[colorType] : colors[0];
	}
}
