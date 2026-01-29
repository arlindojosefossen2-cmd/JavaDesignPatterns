package br.com.ajf.learnjavadesignpatterns.command;

public record SellStock(Stock stock) implements Order
{
	@Override
	public void exec()
	{
		stock.sell();
	}
}
