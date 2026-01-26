package br.com.ajf.learnjavadesignpatterns.composite;

public final class CompositeMain
{
	private CompositeMain()
	{

	}

	public static void main(String[] args)
	{
		System.out.println("Java Design Patterns");
		System.out.println("Composite");

		EmployeeCEO CEO = new EmployeeCEO("Artur","CEO",20000f);

		EmployeeCEO headSales = new EmployeeCEO("Armand","Head Sales",15000f);
		EmployeeCEO headMarketing = new EmployeeCEO("Olaf","headMarketing",14500f);

		Employee marketing1 = new Employee("Tais","Marketing",3500f);
		Employee marketing2 = new Employee("Talia","marketing",3500f);

		Employee executive1 = new Employee("Stuart","Marketing",9950f);
		Employee executive2 = new Employee("Mary","marketing",10500f);

		CEO.addSubordinates(headSales);
		CEO.addSubordinates(headMarketing);

		headMarketing.addSubordinates(marketing1);
		headMarketing.addSubordinates(marketing2);

		headSales.addSubordinates(executive1);
		headSales.addSubordinates(executive2);

		System.out.println(CEO);
	}
}
