package br.com.ajf.learnjavadesignpatterns.adapter;

public final class VlcPlayer implements AdvancedMediaPlayer
{
	@Override
	public void playVlc(String fileName)
	{
		System.out.println("Playing audio: "+fileName);
	}

	@Override
	public void playMp4(String fileName)
	{

	}

	@Override
	public void stop(String fileName)
	{
		System.out.println("Stoping audio: "+fileName);
	}
}
