package br.com.ajf.learnjavadesignpatterns.visitor;

public interface ComputerPart
{
	void accept(ComputerPartVisitor computerPartVisitor);
}
