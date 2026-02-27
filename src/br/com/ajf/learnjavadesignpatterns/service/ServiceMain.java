package br.com.ajf.learnjavadesignpatterns.service;

public final class ServiceMain
{
	private ServiceMain()
	{

	}

	public static void main(String[] args)
	{
		System.out.println("Learn Java Design Patterns\nService Locator\n");

		Service service = ServiceLocator.getService("Service One");
		service.execute();

		service = ServiceLocator.getService("Service Two");
		service.execute();
	}
}
