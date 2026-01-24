package br.com.ajf.learnjavadesignpatterns.adapter;

public interface MediaPlayer
{
	void play(String audioType,String fileName);
	void stop(String audioType,String fileName);
}
