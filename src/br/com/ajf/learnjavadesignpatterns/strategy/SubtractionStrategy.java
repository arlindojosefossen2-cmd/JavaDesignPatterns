package br.com.ajf.learnjavadesignpatterns.strategy;

public final class SubtractionStrategy implements Strategy
{
	@Override
	public int execute(int number1,int number2)
	{
		return number1 - number2;
	}
}
