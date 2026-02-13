package br.com.ajf.learnjavadesignpatterns.delegate;

public final class JMSService implements Service
{
	@Override
	public void processing()
	{
		System.out.println("Processing task by JMS Service");
	}
}
