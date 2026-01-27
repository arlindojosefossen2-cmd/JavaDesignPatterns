package br.com.ajf.learnjavadesignpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public final class FlyweightFactory
{
	private static final Map<String,Shape> circleMap = new HashMap<>();

	public static Circle getCircle(String color)
	{
		Circle circle = (Circle) circleMap.get(color);

		if (circle == null)
		{
			circle = new Circle(color);
			circleMap.put(color,circle);
			System.out.println("Created Circle");
		}
		return circle;
	}
}
