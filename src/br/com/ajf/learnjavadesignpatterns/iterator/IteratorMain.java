package br.com.ajf.learnjavadesignpatterns.iterator;

public final class IteratorMain
{
	private IteratorMain()
	{

	}

	public static void main(String[] args)
	{
		System.out.println("Learn Java Design Patterns");
		System.out.println("Iterator");

		Container repository = new Repository();

		for (Iterator iterator = repository.getIterator(); iterator.hasNext();)
		{
			String name = (String) iterator.next();
			System.out.print("Name:\t"+name+"\n");
		}
	}
}
