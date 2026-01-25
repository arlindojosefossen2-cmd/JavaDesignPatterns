package br.com.ajf.learnjavadesignpatterns.bridge;

public final class BridgeMain
{
	private BridgeMain()
	{

	}

	public static void main(String[] args)
	{
		System.out.println("Java Design Patterns");
		System.out.println("Bridge");

		Shape redCircle = new Circle(64,96,56,new RedCircle());
		Shape greenCircle = new Circle(134,196,48,new GreenCircle());

		redCircle.draw();
		greenCircle.draw();
	}
}
