package br.com.ajf.learnjavadesignpatterns.frontcontroller;

public final class FrontControllerMain
{
	private FrontControllerMain()
	{

	}

	public static void main(String[] args)
	{
		System.out.println("Learn Java Design Patterns\nFront Controller\n");

		FrontController controller = new FrontController("student");
		controller.dispatchRequest();

		controller = new FrontController("home");
		controller.dispatchRequest();
	}
}
