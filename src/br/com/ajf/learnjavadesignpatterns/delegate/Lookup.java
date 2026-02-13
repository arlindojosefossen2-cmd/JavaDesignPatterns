package br.com.ajf.learnjavadesignpatterns.delegate;

public final class Lookup
{
	public Service getService(String type)
	{
		return (type.equalsIgnoreCase("EJB") ?
				new EJBService() : new JMSService());
	}
}
