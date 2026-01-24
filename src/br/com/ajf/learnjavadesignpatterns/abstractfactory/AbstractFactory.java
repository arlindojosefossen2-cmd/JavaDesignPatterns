package br.com.ajf.learnjavadesignpatterns.abstractfactory;

import br.com.ajf.learnjavadesignpatterns.factory.Color;
import br.com.ajf.learnjavadesignpatterns.factory.Shape;

public abstract class AbstractFactory
{
	public abstract Shape getShape(int shapeType);
	public abstract Color getColor(int colorType);
}
