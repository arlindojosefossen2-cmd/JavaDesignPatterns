package br.com.ajf.learnjavadesignpatterns.frontcontroller;

public final class HomeView implements ShowInfo
{
	@Override
	public void show()
	{
		System.out.println("Displaying Home Page");
	}
}
