package br.com.ajf.learnjavadesignpatterns.chain;

public final class ErrorLogger extends AbstractLogger
{
	public ErrorLogger(int level)
	{
		super(level);
	}

	@Override
	protected void write(String message)
	{
		System.out.println("Error Console::Logger: "+message);
	}
}
