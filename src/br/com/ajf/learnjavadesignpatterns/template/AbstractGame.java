package br.com.ajf.learnjavadesignpatterns.template;

public abstract class AbstractGame implements Game
{
	public void display()
	{
		start();
		update();
		render();
	}
}
