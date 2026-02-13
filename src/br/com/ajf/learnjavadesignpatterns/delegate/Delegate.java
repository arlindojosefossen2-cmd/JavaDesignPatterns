package br.com.ajf.learnjavadesignpatterns.delegate;

public final class Delegate
{
	private final Service service;

	public Delegate(String type)
	{
		this.service = new Lookup().getService(type);
	}

	public void task()
	{
		service.processing();
	}
}
