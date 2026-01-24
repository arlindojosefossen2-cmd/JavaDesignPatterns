package br.com.ajf.learnjavadesignpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public final class ShapeCache
{
	private static final Map<Integer,Shape> shapeMap = new HashMap<>();

	private ShapeCache()
	{

	}

	public static Shape getShape(int shapeId) throws CloneNotSupportedException
	{
		return (Shape) shapeMap.get(shapeId).clone();
	}

	public static void loadShapeCache()
	{
		Shape shape = new Circle();
		shape.id = (0);

		shapeMap.put(shape.id,shape);

		shape = new Square();
		shape.id = 1;

		shapeMap.put(shape.id,shape);

		shape = new Rectangle();
		shape.id = 2;

		shapeMap.put(shape.id,shape);
	}
}
