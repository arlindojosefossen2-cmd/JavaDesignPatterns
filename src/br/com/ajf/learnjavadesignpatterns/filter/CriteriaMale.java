package br.com.ajf.learnjavadesignpatterns.filter;

import java.util.ArrayList;
import java.util.List;

public final class CriteriaMale implements ICriteria
{
	@Override
	public List<Person> meetCriteria(List<Person> persons)
	{
		List<Person> mPersons = new ArrayList<>();

		for (Person person : persons)
		{
			if (person.gender().equalsIgnoreCase("Male"))
			{
				mPersons.add(person);
			}
		}

		return mPersons;
	}
}
