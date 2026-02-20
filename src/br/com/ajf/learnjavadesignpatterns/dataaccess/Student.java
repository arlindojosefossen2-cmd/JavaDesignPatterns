package br.com.ajf.learnjavadesignpatterns.dataaccess;

public final class Student
{
	private String name;
	private final int id;

	public Student(int id,String name)
	{
		this.id = id;
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getId()
	{
		return id;
	}
}
