package br.com.ajf.learnjavadesignpatterns.template;

public final class TemplateMain
{
	private TemplateMain()
	{

	}

	public static void main(String[] args)
	{
		System.out.println("Learn Java Design Patterns\nTemplate\n");

		AbstractGame cricket = new Cricket();
		AbstractGame football = new Football();

		cricket.display();
		System.out.println();
		football.display();
	}
}
