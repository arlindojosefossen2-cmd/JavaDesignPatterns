package br.com.ajf.learnjavadesignpatterns.visitor;

public final class Computer implements ComputerPart
{
	private final ComputerPart[] parts;

	public Computer()
	{
		parts = new ComputerPart[]
				{
						new Mouse(),
						new KeyBoard(),
						new Monitor()
				};
	}

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor)
	{
		computerPartVisitor.visit(this);
		for (ComputerPart part : parts)
		{
			part.accept(computerPartVisitor);
		}
	}
}
