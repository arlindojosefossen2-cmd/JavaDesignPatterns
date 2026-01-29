package br.com.ajf.learnjavadesignpatterns.command;

import java.util.ArrayList;
import java.util.List;

public final class Broker
{
	private final List<Order> orderList = new ArrayList<>();

	public void take(Order order)
	{
		orderList.add(order);
	}

	public void place()
	{
		orderList.forEach(Order::exec);
		orderList.clear();
	}
}
