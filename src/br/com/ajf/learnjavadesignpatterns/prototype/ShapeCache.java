package br.com.ajf.learnjavadesignpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public final class ShapeCache
{
	private static final Map<Integer,Shape> shapeMap = new HashMap<>();

	private ShapeCache()
	{

	}

	public static Shape getShape(int shapeId)
	{
		return (Shape) shapeMap.get(shapeId).clone();
	}

	public static void loadShapeCache()
	{
		Shape shape = new Circle();
		shape.setId(0);

		shapeMap.put(shape.getId(),shape);

		shape = new Square();
		shape.setId(1);

		shapeMap.put(shape.getId(),shape);

		shape = new Rectangle();
		shape.setId(2);

		shapeMap.put(shape.getId(),shape);
	}
}
