package br.com.ajf.learnjavadesignpatterns.interceptingfilter;

public final class AuthenticationFilter implements Filter
{
	@Override
	public void execute(String request)
	{
		System.out.println("Authentication: "+request);
	}
}
