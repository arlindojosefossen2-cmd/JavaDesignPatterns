package br.com.ajf.learnjavadesignpatterns.frontcontroller;

public sealed interface ShowInfo permits StudentView,HomeView
{
	void show();
}
