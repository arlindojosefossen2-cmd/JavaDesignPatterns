package br.com.ajf.learnjavadesignpatterns.frontcontroller;

public final class StudentView implements ShowInfo
{
	@Override
	public void show()
	{
		System.out.println("Displaying Student Page");
	}
}
