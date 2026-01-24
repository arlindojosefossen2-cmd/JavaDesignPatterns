package br.com.ajf.learnjavadesignpatterns.abstractfactory;

import br.com.ajf.learnjavadesignpatterns.factory.ColorFactory;
import br.com.ajf.learnjavadesignpatterns.factory.ShapeFactory;

public final class FactoryProducer
{
	public static final int SHAPE_FACTORY = 0;
	public static final int COLOR_FACTORY = 1;

	private FactoryProducer()
	{

	}

	public static AbstractFactory getFactory(int factoryType)
	{
		AbstractFactory factory = null;

		switch (factoryType)
		{
			case SHAPE_FACTORY -> factory = new ShapeFactory();
			case COLOR_FACTORY -> factory = new ColorFactory();
		}

		return factory;
	}
}
