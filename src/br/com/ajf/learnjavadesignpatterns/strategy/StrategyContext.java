package br.com.ajf.learnjavadesignpatterns.strategy;

public record StrategyContext(Strategy strategy)
{
	public int executeStrategy(int number1, int number2)
	{
		return this.strategy.execute(number1, number2);
	}
}
