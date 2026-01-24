package br.com.ajf.learnjavadesignpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public final class Meal
{
	private final List<Item> items = new ArrayList<>();

	public void addItem(Item item)
	{
		if (item != null)
		{
			items.add(item);
		}
	}

	public float getCost()
	{
		float cost = 0;

		for (Item item : items)
		{
			cost += item.price();
		}

		return cost;
	}

	@Override
	public String toString()
	{
		StringBuilder items = new StringBuilder();

		for (Item item : this.items)
		{
			items.append("Item: ").append(item.name()).append(" , Packing: ").append(item.packing().pack()).append(" , price: ").append(item.price()).append("\n");
		}

		items.append("Total Cost: ").append(getCost());

		return items.toString();
	}
}
