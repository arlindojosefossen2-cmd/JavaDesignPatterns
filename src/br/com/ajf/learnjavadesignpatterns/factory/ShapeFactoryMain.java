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
		circle.radium = 32;
		circle.x = 48;
		circle.y = 48;
		circle.draw();

		Square square = (Square) factory.getShape(ShapeFactory.SQUARE);
		square.size = 64;
		square.x = 64;
		square.y = 86;
		square.draw();

		Rectangle rectangle = (Rectangle) factory.getShape(ShapeFactory.RECTANGLE);
		rectangle.width = 48;
		rectangle.height = 64;
		rectangle.x = 29;
		rectangle.y = 96;
		rectangle.draw();
	}
}
