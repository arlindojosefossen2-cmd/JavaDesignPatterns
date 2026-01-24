package br.com.ajf.learnjavadesignpatterns.adapter;

public interface AdvancedMediaPlayer
{
    void playVlc(String fileName);
	void playMp4(String fileName);
	void stop(String fileName);
}
