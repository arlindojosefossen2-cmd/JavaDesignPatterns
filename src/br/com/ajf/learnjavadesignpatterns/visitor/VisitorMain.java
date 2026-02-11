package br.com.ajf.learnjavadesignpatterns.visitor;

public final class VisitorMain
{
	private VisitorMain()
	{

	}

	public static void main(String[] args)
	{
		System.out.println("Learn Java Design Patterns\nVisitor\n");

		Computer computer = new Computer();

		computer.accept(new ComputerPartDisplayVisitor());

	}
}
