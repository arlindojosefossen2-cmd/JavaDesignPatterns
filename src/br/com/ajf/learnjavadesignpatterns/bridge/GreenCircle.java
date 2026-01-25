package br.com.ajf.learnjavadesignpatterns.bridge;

public final class GreenCircle implements IDraw
{

	@Override
	public void drawCircle(float radium, float x, float y)
	{
		System.out.println("GreenCircle [radium: "+radium+" posX: "+x+" posY: "+y+"]");
	}
}
