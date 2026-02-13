package br.com.ajf.learnjavadesignpatterns.delegate;

public final class EJBService implements Service
{
	@Override
	public void processing()
	{
		System.out.println("Processing task by EJB Service");
	}
}
