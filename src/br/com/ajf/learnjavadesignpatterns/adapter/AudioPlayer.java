package br.com.ajf.learnjavadesignpatterns.adapter;

public final class AudioPlayer implements MediaPlayer
{
	private MediaAdapter adapter;

	@Override
	public void play(String audioType, String fileName)
	{
		if (audioType.equalsIgnoreCase("mp3"))
		{
			System.out.println("Playing Mp3: "+fileName);
		}
		else if (audioType.equalsIgnoreCase("vlc")
				|| audioType.equalsIgnoreCase("mp4"))
		{
			adapter = new MediaAdapter(audioType);
			adapter.play(audioType,fileName);
			System.out.println("Playing Mp4 || Vlc: "+fileName);
		}
		else
		{
			System.out.println("Not audio to play: "+fileName);
		}
	}


	@Override
	public void stop(String audioType, String fileName)
	{
		if (audioType.equalsIgnoreCase("mp3"))
		{
			System.out.println("Stoping Mp3: "+fileName);
		}
		else if (audioType.equalsIgnoreCase("vlc")
				|| audioType.equalsIgnoreCase("mp4"))
		{
			if (adapter != null)
			{
				adapter.stop(audioType, fileName);
				System.out.println("Stoping Mp4 || Vlc: " + fileName);
			}
		}
		else
		{
			System.out.println("Not audio to stop: "+fileName);
		}
	}
}
