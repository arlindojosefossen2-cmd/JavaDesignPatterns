package br.com.ajf.learnjavadesignpatterns.chain;

public final class ChainMain
{
	private ChainMain()
	{

	}

	public static void main(String[] args)
	{
		System.out.println("Java Design Patterns");
		System.out.println("Chain Responsibility");

		AbstractLogger logger = getChainLoggers();

		logger.loggerMessage(AbstractLogger.INFO,"This is an info logger");
		logger.loggerMessage(AbstractLogger.DEBUG,"This is an Debug logger");
		logger.loggerMessage(AbstractLogger.ERROR,"This is an error logger");
	}

	private static AbstractLogger getChainLoggers()
	{
		AbstractLogger error = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger file = new ErrorLogger(AbstractLogger.DEBUG);
		AbstractLogger console = new ErrorLogger(AbstractLogger.INFO);

		error.setNextLogger(file);
		file.setNextLogger(console);

		return error;
	}
}
