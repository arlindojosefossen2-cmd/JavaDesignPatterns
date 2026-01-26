package br.com.ajf.learnjavadesignpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public final class EmployeeCEO extends Employee
{
	private final List<Employee> subordinates = new ArrayList<>();

	public EmployeeCEO(String name, String department, float salary)
	{
		super(name, department, salary);
	}

	public void addSubordinates(Employee employee)
	{
		subordinates.add(employee);
	}

	public List<Employee> getSubordinates()
	{
		return subordinates;
	}

	@Override
	public String toString()
	{
		return  "Employee[name: "+getName()+
				", Department: "+getDepartment()+
				", salary:"+getSalary()+"] \n{" +
				" Subordinates=" + getSubordinates() +'}';
	}
}
