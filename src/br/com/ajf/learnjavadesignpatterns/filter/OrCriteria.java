package br.com.ajf.learnjavadesignpatterns.filter;

import java.util.List;

public record OrCriteria(ICriteria criteria, ICriteria otherCriteria) implements ICriteria
{
	@Override
	public List<Person> meetCriteria(List<Person> persons)
	{
		List<Person> fCriteria = this.criteria.meetCriteria(persons);
		List<Person> oCriteria = this.otherCriteria.meetCriteria(persons);

		for (Person person : oCriteria)
		{
			if (!fCriteria.contains(person))
			{
				fCriteria.add(person);
			}
		}

		return fCriteria;
	}
}
