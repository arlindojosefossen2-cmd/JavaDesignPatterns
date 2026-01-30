package br.com.ajf.learnjavadesignpatterns.interpreter;

public final class InterpreterMain
{
	private InterpreterMain()
	{

	}

	public static Expression getMaleExpression(String data1, String data2)
	{
		Expression one = new TerminalExpression(data1);
		Expression tow = new TerminalExpression(data2);
		return new OrExpression(one,tow);
	}
	public static Expression getMarriedWomanExpression(String data1, String data2)
	{
		Expression one = new TerminalExpression(data1);
		Expression tow = new TerminalExpression(data2);
		return new AndExpression(one,tow);
	}

	public static void main(String[] args)
	{
		System.out.println("Java Design Patterns");
		System.out.println("Interpreter\n");

		Expression isMale = getMaleExpression("Robert","John");
		System.out.println(isMale.interpret("John"));

		Expression isMarried = getMarriedWomanExpression("Lucia","Married");
		System.out.println(isMarried.interpret("Married Lucia"));
	}
}
