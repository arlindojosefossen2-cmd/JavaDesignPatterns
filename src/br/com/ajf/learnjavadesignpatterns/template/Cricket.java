package br.com.ajf.learnjavadesignpatterns.template;

public final class Cricket extends AbstractGame
{
	@Override
	public void start()
	{
		System.out.println("Cricket start");

	}

	@Override
	public void update()
	{
		System.out.println("Cricket update");
	}

	@Override
	public void render()
	{
		System.out.println("Cricket stop");
	}
}
