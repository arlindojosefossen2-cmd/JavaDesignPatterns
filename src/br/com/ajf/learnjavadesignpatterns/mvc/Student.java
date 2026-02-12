package br.com.ajf.learnjavadesignpatterns.mvc;

public record Student(String name, String ra)
{
	@Override
	public String toString()
	{
		return "Student{" +
				"name='" + name + '\'' +
				", ra='" + ra + '\'' +
				"}";
	}
}