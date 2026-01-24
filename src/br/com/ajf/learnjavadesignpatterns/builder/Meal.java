package br.com.ajf.learnjavadesignpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public final class Meal
{
	private List<Item> items = new ArrayList<>();

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
		String items = "";

		for (Item item : this.items)
		{
			items += "Item: "+item.name()+" , Packing: "+item.packing().pack()+" , price: "+item.price()+"\n";
		}

		items += "Total Cost: "+getCost();

		return items;
	}
}
