package br.com.ajf.learnjavadesignpatterns.frontcontroller;

public final class Dispatcher
{
	private final String request;
	private ShowInfo showInfo;

	public Dispatcher(String request)
	{
		this.request = request;
		if(request.equalsIgnoreCase("STUDENT"))
		{
			showInfo = new StudentView();
		}
		else if(request.equalsIgnoreCase("HOME"))
		{
			showInfo = new HomeView();
		}
	}

	public void dispatch()
	{
		showInfo.show();
	}
	public String getRequest()
	{
		return request;
	}
}
