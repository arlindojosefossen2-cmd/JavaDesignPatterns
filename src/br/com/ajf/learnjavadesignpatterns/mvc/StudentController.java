package br.com.ajf.learnjavadesignpatterns.mvc;

public final class StudentController
{
	Student student;
	StudentView view;

	public StudentController(Student student,StudentView view)
	{
		this.student = student;
		this.view = view;
	}

	public void updateStudent()
	{
		view.printStudent(student);
	}
}
