package br.com.ajf.learnjavadesignpatterns.interceptingfilter;

public final class Target implements Filter
{
	@Override
	public void execute(String request)
	{
		System.out.println("Executing: "+request);
	}
}
