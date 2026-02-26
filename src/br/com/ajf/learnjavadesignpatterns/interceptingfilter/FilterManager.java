package br.com.ajf.learnjavadesignpatterns.interceptingfilter;

public final class FilterManager
{
	private final FilterChain filterChain;

	public FilterManager(Filter target)
	{
		filterChain = new FilterChain();
		filterChain.setTarget(target);
	}

	public void filterRequest(String request)
	{
		filterChain.execute(request);
	}

	public void setFilter(Filter filter)
	{
		filterChain.addFilter(filter);
	}
}
