package br.com.ajf.learnjavadesignpatterns.state;

public final class StopState implements State
{
	@Override
	public void executeAction(Context context)
	{
		System.out.println("Stop State");
		context.setState(this);
	}

	@Override
	public String toString()
	{
		return "Stop State";
	}
}
