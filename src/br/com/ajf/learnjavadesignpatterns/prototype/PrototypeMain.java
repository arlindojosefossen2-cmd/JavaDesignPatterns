package br.com.ajf.learnjavadesignpatterns.prototype;

public final class PrototypeMain
{
	private PrototypeMain()
	{

	}

	public static void main(String[] args) throws CloneNotSupportedException
	{
		System.out.println("Learn Jave Design Patterns");
		System.out.println("Prototype");

		ShapeCache.loadShapeCache();
		Shape shape = ShapeCache.getShape(1);
		shape.draw();

		shape = ShapeCache.getShape(2);
		shape.draw();

		shape = ShapeCache.getShape(0);
		shape.draw();
	}
}
