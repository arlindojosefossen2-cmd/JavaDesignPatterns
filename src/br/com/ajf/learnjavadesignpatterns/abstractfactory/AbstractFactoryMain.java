package br.com.ajf.learnjavadesignpatterns.abstractfactory;

import br.com.ajf.learnjavadesignpatterns.factory.*;

public final class AbstractFactoryMain
{
	private AbstractFactoryMain()
	{

	}

	public static void main(String[] args)
	{
		System.out.println("Learn Java Design Patterns");
		System.out.println("Abstract Factory");

		AbstractFactory factory = FactoryProducer.getFactory(FactoryProducer.SHAPE_FACTORY);

		Circle circle = (Circle) factory.getShape(ShapeFactory.CIRCLE);
		circle.setRadium(32);
		circle.setX(28);
		circle.setY(48);
		circle.draw();

		Square square = (Square) factory.getShape(ShapeFactory.SQUARE);
		square.setSize(64);
		square.setX(21);
		square.setY(86);
		square.draw();

		Rectangle rectangle = (Rectangle) factory.getShape(ShapeFactory.RECTANGLE);
		rectangle.setWidth(48);
		rectangle.setHeight(64);
		rectangle.setX(29);
		rectangle.setY(96);
		rectangle.draw();

		factory = FactoryProducer.getFactory(FactoryProducer.COLOR_FACTORY);

		Color color = factory.getColor(ColorFactory.RED);
		color.fill();

		color = factory.getColor(ColorFactory.GREEN);
		color.fill();

		color = factory.getColor(ColorFactory.BLUE);
		color.fill();
	}
}
