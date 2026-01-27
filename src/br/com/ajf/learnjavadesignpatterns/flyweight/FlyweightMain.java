package br.com.ajf.learnjavadesignpatterns.flyweight;

public final class FlyweightMain
{
	private static final String[] colors =
			{
				"RED",
				"GREEN",
				"BLUE",
				"WHITE",
				"BLACK",
				"BROWN",
			};

	private FlyweightMain()
	{

	}

	public static void main(String[] args)
	{
		System.out.println("Learn Java Design Patterns");
		System.out.println("Flyweight");

		final int size = 15;

		for (int i = 0; i < size; i++)
		{
			Circle circle = FlyweightFactory.getCircle(getRandomColor());
			circle.setX(getRandom());
			circle.setY(getRandom());
			circle.setRadius(getRandom()+86f);
			circle.draw();
		}

	}

	private static String getRandomColor()
	{
		return colors[(int)(Math.random()*colors.length)];
	}

	private static float getRandom()
	{
		return (float) (Math.random()*199);
	}
}
