package br.com.ajf.learnjavadesignpatterns.observer;

public final class BinaryObserver extends Observer
{
	public BinaryObserver(Subject subject)
	{
		super(subject);
	}

	@Override
	public void update()
	{
		System.out.println("Binary String: "+Integer.toBinaryString(this.subject.getState()));
	}
}
