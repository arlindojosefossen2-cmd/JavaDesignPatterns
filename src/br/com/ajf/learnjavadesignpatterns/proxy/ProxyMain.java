package br.com.ajf.learnjavadesignpatterns.proxy;

public final class ProxyMain
{
	private ProxyMain()
	{

	}

	public static void main(String[] args)
	{
		System.out.println("Learn Java Design Patterns");
		System.out.println("Proxy\n");

		Image image = new ProxyImage("test-notting-image.png");

		int time = 0;
		final int maxTime = 15;

		while(time <= maxTime)
		{
			image.display();

			System.out.println("---------------------------------");
			time++;
		}
	}
}
