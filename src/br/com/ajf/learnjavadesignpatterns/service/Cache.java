package br.com.ajf.learnjavadesignpatterns.service;

import java.util.ArrayList;
import java.util.List;

public final class Cache
{
	private final List<Service> services = new ArrayList<>();

	public  Service getService(String serviceName)
	{
		for (Service service : services)
		{
			if (service.getName().equalsIgnoreCase(serviceName))
			{
				System.out.println("Cached: " + serviceName + " object");
				return service;
			}
		}
		return null;
	}

	public void addService(Service newService)
	{
		boolean exists = false;

		for (Service service : services)
		{
			if (service.getName().equalsIgnoreCase(newService.getName()))
			{
				exists = true;
			}
		}

		if(!exists)
		{
			services.add(newService);
		}
	}
}
