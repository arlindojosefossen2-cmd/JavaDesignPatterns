package br.com.ajf.learnjavadesignpatterns.dataaccess;

import java.util.List;

public interface StudentDao
{
	List<Student> getStudents();
	Student getStudent(int id);
	void addStudent(Student student);
	void update(Student student);
	void delete(Student student);
}
