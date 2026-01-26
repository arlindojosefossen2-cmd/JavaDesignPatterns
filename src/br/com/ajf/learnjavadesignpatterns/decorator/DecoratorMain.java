package br.com.ajf.learnjavadesignpatterns.decorator;

public final class DecoratorMain
{
	private DecoratorMain()
	{

	}

	public static void main(String[] args)
	{
		System.out.println("Java Design Patterns");
		System.out.println("Decorator");

		Shape circle = new Circle();

		Shape redCircle = new RedShapeDecorator(new Circle());

		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("Circle normal border");
		circle.draw();

		System.out.println("Rectangle red border");
		redRectangle.draw();

		System.out.println("Circle red border");
		redCircle.draw();
	}
}
