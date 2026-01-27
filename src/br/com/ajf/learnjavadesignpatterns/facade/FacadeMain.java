package br.com.ajf.learnjavadesignpatterns.facade;

public final class FacadeMain
{
	private FacadeMain()
	{

	}

	public static void main(String[] args)
	{
		System.out.println("Learn Java Design Patterns");
		System.out.println("Facade\n");

		ShapeCreator creator = new ShapeCreator();

		creator.drawCircle();
		creator.drawRectangle();
		creator.drawSquare();
	}
}
