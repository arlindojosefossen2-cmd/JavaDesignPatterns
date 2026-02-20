package br.com.ajf.learnjavadesignpatterns.dataaccess;

import java.util.ArrayList;
import java.util.List;

public final class StudentDapImpl implements StudentDao
{
	private final List<Student> students = new ArrayList<>();

	@Override
	public List<Student> getStudents()
	{
		return students;
	}

	@Override
	public Student getStudent(int id)
	{
		return students.get(id);
	}

	@Override
	public void addStudent(Student student)
	{
		students.add(student);
	}

	@Override
	public void update(Student student)
	{
		if(students.contains(student))
		{
			students.get(student.getId()).setName(student.getName());
			System.out.println("Update Student");
		}
	}

	@Override
	public void delete(Student student)
	{
		students.remove(student.getId());
		System.out.println("Delete Student");
	}
}
