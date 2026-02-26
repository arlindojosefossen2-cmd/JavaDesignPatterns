package br.com.ajf.learnjavadesignpatterns.interceptingfilter;

import java.util.ArrayList;
import java.util.List;

public final class FilterChain
{
	private final List<Filter> filters = new ArrayList<>();
	private Filter target;

	public void addFilter(Filter filter)
	{
		filters.add(filter);
	}

	public void execute(String request)
	{
		for (Filter filter : filters)
		{
			filter.execute(request);
		}

		target.execute(request);
	}

	public void setTarget(Filter target)
	{
		this.target = target;
	}
}
