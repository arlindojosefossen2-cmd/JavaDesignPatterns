package br.com.ajf.learnjavadesignpatterns.chain;

public abstract class AbstractLogger
{
	public static final int INFO = 1;
	public static final int DEBUG = 2;
	public static final int ERROR = 3;

	protected int level;
	protected AbstractLogger nextLogger;

	public AbstractLogger(int level)
	{
		this.level = level;
	}

	public void setNextLogger(AbstractLogger nextLogger)
	{
		this.nextLogger = nextLogger;
	}

	public void loggerMessage(int level,String message)
	{
		if(this.level <= level)
		{
			write(message);
		}

		if(nextLogger != null)
		{
			nextLogger.loggerMessage(level,message);
		}
	}

	protected abstract void write(String message);
}
