package br.com.ajf.learnjavadesignpatterns.filter;

import java.util.ArrayList;
import java.util.List;

public final class CriteriaFemale implements ICriteria
{
	@Override
	public List<Person> meetCriteria(List<Person> persons)
	{
		List<Person> fPersons = new ArrayList<>();

		for (Person person : persons)
		{
			if (person.gender().equalsIgnoreCase("Female"))
			{
				fPersons.add(person);
			}
		}

		return fPersons;
	}
}
