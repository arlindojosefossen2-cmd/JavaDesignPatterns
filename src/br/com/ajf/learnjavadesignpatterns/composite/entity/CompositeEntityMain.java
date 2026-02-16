package br.com.ajf.learnjavadesignpatterns.composite.entity;

public final class CompositeEntityMain
{
	private CompositeEntityMain()
	{

	}

	public static void main(String[] args)
	{
		System.out.println("Learn Java Design Patterns\nComposite Entity\n");

		Client client = new Client();

		client.setData("Testing data1","Testing data2");
		client.printData();

		client.setData("Testing data1 Again","Testing data2 Again ");
		client.printData();
	}
}
