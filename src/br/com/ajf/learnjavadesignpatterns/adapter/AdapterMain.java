package br.com.ajf.learnjavadesignpatterns.adapter;

public final class AdapterMain
{
	private AdapterMain()
	{

	}

	public static void main(String[] args)
	{
		System.out.println("Learn Java Design Patterns");
		System.out.println("Adapter");

		AudioPlayer audio = new AudioPlayer();

		audio.play("mp4","testing.mp4");
		audio.play("mp3","main.mp3");
		audio.play("vlc","notting.vlc");
		audio.play("vli","notting.vli");

		audio.stop("mp4","testing.mp4");
		audio.stop("mp3","main.mp3");
		audio.stop("vlc","notting.vlc");
		audio.stop("vli","notting.vli");
	}
}
