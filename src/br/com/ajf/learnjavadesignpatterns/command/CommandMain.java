package br.com.ajf.learnjavadesignpatterns.command;

public final class CommandMain
{
	public static void main(String[] args)
	{
		System.out.println("Learn Java Design Patterns");
		System.out.println("Command\n");

		Stock stock = new Stock();

		BuyStock buyStock = new BuyStock(stock);
		SellStock sellStock = new SellStock(stock);

		Broker broker = new Broker();
		broker.take(buyStock);
		broker.take(sellStock);
		broker.place();
	}
}
