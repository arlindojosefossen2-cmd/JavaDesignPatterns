package br.com.ajf.learnjavadesignpatterns.mvc;

public final class MvcMain
{
	private MvcMain()
	{

	}

	public static void main(String[] args)
	{
		System.out.println("Learn Java Design Patterns\nMVC\n");

		Student student = new Student("Artur Marte","364955959");
		StudentView view = new StudentView();
		StudentController controller = new StudentController(student,view);
		controller.updateStudent();

		student = new Student("Mary Lana","774747478393");
		controller = new StudentController(student,view);
		controller.updateStudent();
	}
}
