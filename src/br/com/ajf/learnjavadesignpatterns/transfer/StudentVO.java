package br.com.ajf.learnjavadesignpatterns.transfer;

public final class StudentVO
{
	private String name;
	private final int number;

	public StudentVO(String name, int number)
	{
		this.name = name;
		this.number = number;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public int getNumber()
	{
		return number;
	}

	@Override
	public String toString()
	{
		return "StudentVO{" +
				"name='" + getName() + '\'' +
				", number=" + getNumber() +
				'}';
	}
}
