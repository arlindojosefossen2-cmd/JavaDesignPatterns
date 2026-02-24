package br.com.ajf.learnjavadesignpatterns.frontcontroller;

public final class FrontController
{
	private final Dispatcher dispatcher;

	public FrontController(String request)
	{
		dispatcher = new Dispatcher(request);
	}

	private boolean isAuthenticUser()
	{
		System.out.println("User is authenticated successfully!");
		return true;
	}

	public void trackRequest(String request)
	{
		System.out.println("Page request: "+request+".");
	}

	public void  dispatchRequest()
	{
		trackRequest(dispatcher.getRequest());
		if(isAuthenticUser())
		{
			dispatcher.dispatch();
		}
	}
}
