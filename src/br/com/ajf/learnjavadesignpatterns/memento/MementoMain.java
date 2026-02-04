package br.com.ajf.learnjavadesignpatterns.memento;

public final class MementoMain
{
	private MementoMain()
	{

	}

	public static void main(String[] args)
	{
		System.out.println("Learn Java Design Patterns\nMemento\n");

		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();

		originator.setState("State 1");
		originator.setState("State 2");
		careTaker.add(originator.saveStateToMemento());

		originator.setState("State 3");
		originator.setState("State 4");
		originator.setState("State 5");
		careTaker.add(originator.saveStateToMemento());

		originator.setState("State 6");

		System.out.println("Current State: "+originator.getState());

		originator.getStateFromMemento(careTaker.get(0));

		System.out.println("Save State: "+originator.getState());

		originator.getStateFromMemento(careTaker.get(1));

		System.out.println("Save State: "+originator.getState());

	}
}
