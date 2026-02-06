package br.com.ajf.learnjavadesignpatterns.state;

public final class StateMain
{
	private StateMain()
	{

	}

	public static void main(String[] args)
	{
		System.out.println("Learn Java Design Patterns\nState\n");

		Context context = new Context();

		State startState = new StartState();
		startState.executeAction(context);
		System.out.println(context.getState().toString());

		State stopState = new StopState();
		stopState.executeAction(context);
		System.out.println(context.getState().toString());
	}
}
