package br.com.ajf.learnjavadesignpatterns.chain;

public final class ConsoleLogger extends AbstractLogger
{
	public ConsoleLogger(int level)
	{
		super(level);
	}

	@Override
	protected void write(String message)
	{
		System.out.println("Standard Console::Logger: "+message);
	}
}
