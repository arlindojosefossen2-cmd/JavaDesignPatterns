package br.com.ajf.learnjavadesignpatterns.builder;

public final class MealBuilder
{
	public Meal prepareVegMeal()
	{
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	public Meal prepareNonVegMeal()
	{
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
