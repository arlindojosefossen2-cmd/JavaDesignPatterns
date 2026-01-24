package br.com.ajf.learnjavadesignpatterns.builder;

public final class BuilderMain
{
	private BuilderMain()
	{

	}

	public static void main(String[] args)
	{
		System.out.println("Learn Java Design Patterns");
		System.out.println("Builder");

		MealBuilder builder = new MealBuilder();

		Meal vegMeal = builder.prepareVegMeal();

		System.out.println(vegMeal);

		Meal nonVegmeal = builder.prepareNonVegMeal();
		System.out.println(nonVegmeal);
	}
}
