package br.com.ajf.learnjavadesignpatterns.filter;

import java.util.List;

public record AndCriteria(ICriteria criteria, ICriteria otherCriteria) implements ICriteria
{
	@Override
	public List<Person> meetCriteria(List<Person> persons)
	{
		List<Person> fCriteria = this.criteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(fCriteria);
	}
}
