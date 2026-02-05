package br.com.ajf.learnjavadesignpatterns.observer;

public final class HexaObserver extends Observer
{
	public HexaObserver(Subject subject)
	{
		super(subject);
	}

	@Override
	public void update()
	{
		System.out.println("Hexadecimal String: "+Integer.toHexString(this.subject.getState()).toUpperCase());
	}
}
