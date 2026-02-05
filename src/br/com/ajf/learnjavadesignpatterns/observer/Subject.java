package br.com.ajf.learnjavadesignpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public final class Subject
{
	private final List<Observer> observerList = new ArrayList<>();
	private int state;

	public int getState()
	{
		return state;
	}

	public void setState(int state)
	{
		this.state = state;
		notifyAllObservers();
	}

	private void notifyAllObservers()
	{
		observerList.forEach(Observer::update);
	}

	public void attach(Observer observer)
	{
		observerList.add(observer);
	}
}
