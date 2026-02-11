package br.com.ajf.learnjavadesignpatterns.visitor;

public interface ComputerPartVisitor
{
	void visit(Computer computerPart);
	void visit(Monitor computerPart);
	void visit(KeyBoard computerPart);
	void visit(Mouse computerPart);
}
