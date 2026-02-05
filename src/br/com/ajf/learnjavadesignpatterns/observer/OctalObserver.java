package br.com.ajf.learnjavadesignpatterns.observer;

public final class OctalObserver extends Observer
{
	public OctalObserver(Subject subject)
	{
		super(subject);
	}

	@Override
	public void update()
	{
		System.out.println("Octal String: "+Integer.toOctalString(this.subject.getState()));
	}
}
