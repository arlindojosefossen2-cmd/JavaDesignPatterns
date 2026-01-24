package br.com.ajf.learnjavadesignpatterns.factory;

public final class ShapeFactoryMain
{
	private ShapeFactoryMain()
	{

	}

	public static void main(String[] args)
	{
		System.out.println("Learn Java Design Patterns");
		System.out.println("Factory");

		ShapeFactory factory = new ShapeFactory();

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
	}
}
