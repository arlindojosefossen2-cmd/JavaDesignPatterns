package br.com.ajf.learnjavadesignpatterns.strategy;

public final class StrategyMain
{
	private StrategyMain()
	{

	}

	public static void main(String[] args)
	{
		System.out.println("Learn Java Design Patterns\nStrategy");

		StrategyContext context = new StrategyContext(new AddictionStrategy());

		System.out.println("Context Add -> 10+5: "+context.executeStrategy(10,5));

		context = new StrategyContext(new SubtractionStrategy());
		System.out.println("Context Sub -> 39-10: "+context.executeStrategy(39,10));

		context = new StrategyContext(new MultiplicationStrategy());
		System.out.println("Context Multiply: 3x4: "+context.executeStrategy(3,4));
	}
}
