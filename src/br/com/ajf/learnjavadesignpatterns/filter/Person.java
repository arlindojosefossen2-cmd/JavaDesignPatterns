package br.com.ajf.learnjavadesignpatterns.filter;

public record Person(String name, String gender, String maritalStatus)
{
	@Override
	public String toString()
	{
		return "Person{" +
				"name='" + name() + '\'' +
				", gender='" + gender() + '\'' +
				", maritalStatus='" + maritalStatus() + '\'' +
				'}';
	}
}
