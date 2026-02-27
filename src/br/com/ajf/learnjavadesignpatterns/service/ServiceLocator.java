package br.com.ajf.learnjavadesignpatterns.service;

public final class ServiceLocator
{
	private static final Cache cache = new Cache();

	public static Service getService(String jndiName)
	{
		Service service = cache.getService(jndiName);

		if(service != null)
		{
			return service;
		}

		InitialContext initialContext = new InitialContext();
		Service other = (Service) initialContext.lookup(jndiName);
		cache.addService(other);

		return other;
	}
}
