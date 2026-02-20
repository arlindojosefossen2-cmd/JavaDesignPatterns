package br.com.ajf.learnjavadesignpatterns.dataaccess;

import java.util.List;

public final class MainDao
{
	private MainDao()
	{

	}

	public static void main(String[] args)
	{
		System.out.println("Learn Java Design Patterns\nData Access\n");

		Student student1 = new Student(0,"Mary");
		StudentDao studentDao = new StudentDapImpl();
		Student student2 = new Student(1,"Bob");
		studentDao.addStudent(student1);
		studentDao.addStudent(student2);
		Student student3 = new Student(2,"Ana");
		studentDao.addStudent(student3);
		studentDao.delete(student2);

		List<Student> students = studentDao.getStudents();


		for (Student s : students)
		{
			System.out.println("Student name: "+s.getName());
		}

		Student aux = studentDao.getStudent(0);

		System.out.println("Student name: "+aux.getName());
	}
}
