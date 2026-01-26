package br.com.ajf.learnjavadesignpatterns.composite;

public class Employee
{
	private final String name;
	private final String department;
	private final float salary;

	public Employee(String name,String department,float salary)
	{
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public String toString()
	{
		return "Employee{" +
				"name='" + name + '\'' +
				", department='" + department + '\'' +
				", salary=" + salary +
				"}\n";
	}

	public String getDepartment()
	{
		return department;
	}

	public float getSalary()
	{
		return salary;
	}

	public String getName()
	{
		return name;
	}
}
