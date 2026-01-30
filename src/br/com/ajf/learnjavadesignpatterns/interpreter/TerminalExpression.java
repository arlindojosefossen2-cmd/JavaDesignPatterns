package br.com.ajf.learnjavadesignpatterns.interpreter;

public record TerminalExpression(String data) implements Expression
{
	@Override
	public boolean interpret(String context)
	{
		return context.contains(data);
	}

	@Override
	public String toString()
	{
		return "TerminalExpression{" +
				"data='" + data + '\'' +
				'}';
	}
}
