package br.com.ajf.learnjavadesignpatterns.command;

public final class Stock
{
	private final String name = "ABC";
	private final int quantity = 10;

	public void buy()
	{
		System.out.println("Buy name "+name+" quant: "+quantity+" bought");
	}
	public void sell()
	{
		System.out.println("Sell name "+name+" quant: "+quantity+" sold");
	}
}
