package br.com.ajf.learnjavadesignpatterns.delegate;

public final class Delegate
{
	private final Service service;

	public Delegate(String type)
	{
		final Lookup lookup = new Lookup();
		this.service = lookup.getService(type);
	}

	public void task()
	{
		service.processing();
	}
}
