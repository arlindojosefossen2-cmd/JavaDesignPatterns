package br.com.ajf.learnjavadesignpatterns.nullable;

public final class NullableMain
{
	private NullableMain()
	{

	}

	public static void main(String[] args)
	{
		System.out.println("Learn Java Design Patterns\nNullable Object");

		AbstractCustomer c1 = CustomerFactory.getCustomer("Ronny");
		AbstractCustomer c2 = CustomerFactory.getCustomer("Mary");
		AbstractCustomer c3 = CustomerFactory.getCustomer("Bob");
		AbstractCustomer c4 = CustomerFactory.getCustomer("ana");
		AbstractCustomer c5 = CustomerFactory.getCustomer("robert");
		AbstractCustomer c6 = CustomerFactory.getCustomer("Roxy");

		System.out.println("Printing Customers");

		if(!c2.isNull())
		{
			System.out.println(c2.getName());
		}
		System.out.println(c3.getName());
		System.out.println(c4.getName());
		System.out.println(c5.getName());

		if(c1.isNull())
		{
			System.out.println(c1.getName());
		}

		System.out.println(c6.getName());
	}
}
