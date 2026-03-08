package br.com.ajf.learnjavadesignpatterns.transfer;

import java.util.ArrayList;
import java.util.List;

public final class StudentBO
{
	private final List<StudentVO> students = new ArrayList<>();

	public StudentBO()
	{
		students.add(new StudentVO("Bob",0));
		students.add(new StudentVO("Mary",1));
		students.add(new StudentVO("John",2));
	}
	public void add(StudentVO student)
	{
		students.add(student);
	}

	public void delete(StudentVO student)
	{
		this.students.remove(student);
	}
	public void update(StudentVO student)
	{
		this.students.add(student.getNumber(),student);
	}

	public List<StudentVO> getStudents()
	{
		return this.students;
	}

	public StudentVO getStudent(int number)
	{
		return this.students.get(number);
	}
}
