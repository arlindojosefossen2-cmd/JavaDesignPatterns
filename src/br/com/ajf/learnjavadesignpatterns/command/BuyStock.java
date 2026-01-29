package br.com.ajf.learnjavadesignpatterns.command;

public record BuyStock(Stock stock) implements Order
{
	@Override
	public void exec()
	{
		stock.buy();
	}
}
