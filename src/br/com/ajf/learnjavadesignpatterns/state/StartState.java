package br.com.ajf.learnjavadesignpatterns.state;

public final class StartState implements State
{
	@Override
	public void executeAction(Context context)
	{
		System.out.println("Start State");
		context.setState(this);
	}

	@Override
	public String toString()
	{
		return "State State";
	}
}
