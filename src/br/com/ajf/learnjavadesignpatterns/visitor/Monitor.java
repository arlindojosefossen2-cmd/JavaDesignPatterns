package br.com.ajf.learnjavadesignpatterns.visitor;

public final class Monitor implements ComputerPart
{
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor)
	{
		computerPartVisitor.visit(this);
	}
}
