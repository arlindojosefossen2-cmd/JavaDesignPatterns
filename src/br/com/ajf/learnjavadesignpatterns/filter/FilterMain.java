package br.com.ajf.learnjavadesignpatterns.filter;

import java.util.ArrayList;
import java.util.List;

public final class FilterMain
{
	private FilterMain()
	{

	}

	public static void main(String[] args)
	{
		System.out.println("Learn Java Design Patterns");
		System.out.println("Filter");

		List<Person> personList = new ArrayList<>();

		personList.add(new Person("Arnoud Getter","Male","Single"));
		personList.add(new Person("Ana Getter","Female","Single"));
		personList.add(new Person("Mary Getter","female","Married"));
		personList.add(new Person("Lust Getter","Male","Married"));
		personList.add(new Person("Laura Getter","female","Single"));
		personList.add(new Person("Diane Getter","female","Married"));
		personList.add(new Person("Mike Getter","Male","Single"));
		personList.add(new Person("Bobby Getter","Male","Single"));
		personList.add(new Person("Letterman Getter","Male","Single"));

		ICriteria male = new CriteriaMale();
		ICriteria female = new CriteriaFemale();
		ICriteria single = new CriteriaSingle();
		ICriteria singleMale = new AndCriteria(single,male);
		ICriteria singleOrFemale  = new OrCriteria(single,female);

		System.out.println("Males: ");
		printPersons(male.meetCriteria(personList));

		System.out.println("Females: ");
		printPersons(female.meetCriteria(personList));

		System.out.println("Single: ");
		printPersons(single.meetCriteria(personList));

		System.out.println("Single Males: ");
		printPersons(singleMale.meetCriteria(personList));

		System.out.println("Single or Females: ");
		printPersons(singleOrFemale.meetCriteria(personList));
	}

	private static void printPersons(List<Person> people)
	{
		for (Person person : people)
		{
			System.out.println(person);
		}
	}
}
