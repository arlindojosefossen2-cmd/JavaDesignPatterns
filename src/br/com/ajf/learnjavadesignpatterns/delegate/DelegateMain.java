package br.com.ajf.learnjavadesignpatterns.delegate;

public final class DelegateMain
{
	private DelegateMain()
	{

	}

	public static void main(String[] args)
	{
		System.out.println("Learn Java Design Patterns\nDelegate\n");

		Delegate delegate = new Delegate("EJB");

		Client client = new Client(delegate);

		client.task();

		delegate = new Delegate("JMS");

		client = new Client(delegate);

		client.task();

	}
}
