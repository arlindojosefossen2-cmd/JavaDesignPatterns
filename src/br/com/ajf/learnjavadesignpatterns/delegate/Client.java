package br.com.ajf.learnjavadesignpatterns.delegate;

public record Client(Delegate delegate)
{
	public void task()
	{
		this.delegate.task();
	}
}
