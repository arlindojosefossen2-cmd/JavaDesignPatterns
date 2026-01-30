package br.com.ajf.learnjavadesignpatterns.interpreter;

public record AndExpression(Expression expression1, Expression expression2) implements Expression
{

	@Override
	public boolean interpret(String context)
	{
		return expression1.interpret(context) && expression2.interpret(context);
	}

	@Override
	public String toString()
	{
		return "AndExpression{" +
				"expression1=" + expression1 +
				", expression2=" + expression2 +
				'}';
	}
}
