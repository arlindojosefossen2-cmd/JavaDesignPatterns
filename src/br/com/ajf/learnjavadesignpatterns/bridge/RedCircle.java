package br.com.ajf.learnjavadesignpatterns.bridge;

public final class RedCircle implements IDraw
{

	@Override
	public void drawCircle(float radium, float x, float y)
	{
		System.out.println("RedCircle [radium: "+radium+" posX: "+x+" posY: "+y+"]");
	}
}
