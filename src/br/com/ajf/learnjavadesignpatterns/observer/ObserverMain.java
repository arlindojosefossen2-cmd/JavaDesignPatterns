package br.com.ajf.learnjavadesignpatterns.observer;

public final class ObserverMain
{
	private ObserverMain()
	{

	}

	public static void main(String[] args)
	{
		System.out.println("Learn Java Design Patterns\nObserver\n");

		Subject subject = new Subject();

		new HexaObserver(subject);
		new BinaryObserver(subject);
		new OctalObserver(subject);

		System.out.println("First observer: 15 ");
		subject.setState(15);

		System.out.println("\nSecond observer: 37 ");
		subject.setState(10);
	}
}
