package br.com.ajf.learnjavadesignpatterns.mediator;

import java.util.Date;

public final class ChatRoom
{
	private ChatRoom()
	{

	}

	public static void showMessage(User user,String message)
	{
		System.out.println(new Date()+"\t["+user.getName()+"]:\t"+message);

	}
}
