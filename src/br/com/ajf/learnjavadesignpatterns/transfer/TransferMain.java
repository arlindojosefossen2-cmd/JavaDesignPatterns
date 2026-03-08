package br.com.ajf.learnjavadesignpatterns.transfer;

public final class TransferMain
{
	private TransferMain()
	{

	}

	public static void main(String[] args)
	{
		System.out.println("Learn Java design Patterns\nTransfer\n");

		StudentBO studentBusiness = new StudentBO();

		for (StudentVO student : studentBusiness.getStudents())
		{
			System.out.println(student);
		}

		StudentVO updateStudentVO = studentBusiness.getStudent(2);
		updateStudentVO.setName("Lobster");
		studentBusiness.update(updateStudentVO);

		System.out.println(studentBusiness.getStudent(2));

		studentBusiness.delete(updateStudentVO);

		for (StudentVO student : studentBusiness.getStudents())
		{
			System.out.println(student);
		}
	}
}
