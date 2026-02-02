package br.com.ajf.learnjavadesignpatterns.iterator;

public class Repository implements Container
{
	private String[] names = {"Todd","Mary","Anne","John","Bob"};

	@Override
	public Iterator getIterator()
	{
		return new IteratorRepository();
	}

	private class IteratorRepository implements Iterator
	{
		private int index;

		@Override
		public boolean hasNext()
		{
			if (index < names.length)
			{
				return true;
			}
			return false;
		}

		@Override
		public Object next()
		{
			if (this.hasNext())
			{
				return names[index++];
			}
			return null;
		}
	}
}
