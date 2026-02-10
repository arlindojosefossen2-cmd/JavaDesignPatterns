package br.com.ajf.learnjavadesignpatterns.template;

public final class Football extends AbstractGame
{
	@Override
	public void start()
	{
		System.out.println("FootBall start");

	}

	@Override
	public void update()
	{
		System.out.println("FootBall update");
	}

	@Override
	public void render()
	{
		System.out.println("FootBall stop");
	}
}
