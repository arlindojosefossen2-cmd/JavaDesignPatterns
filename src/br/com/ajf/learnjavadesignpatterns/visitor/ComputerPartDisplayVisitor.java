package br.com.ajf.learnjavadesignpatterns.visitor;

public final class ComputerPartDisplayVisitor implements ComputerPartVisitor
{

	@Override
	public void visit(Computer computerPart)
	{
		System.out.println("Computer");
	}

	@Override
	public void visit(Monitor computerPart)
	{
		System.out.println("Monitor");
	}

	@Override
	public void visit(KeyBoard computerPart)
	{
		System.out.println("KeyBoard");
	}

	@Override
	public void visit(Mouse computerPart)
	{
		System.out.println("Mouse");
	}
}
