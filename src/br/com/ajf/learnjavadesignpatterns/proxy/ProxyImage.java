package br.com.ajf.learnjavadesignpatterns.proxy;

public final class ProxyImage implements Image
{
	private Image image;
	private final String fileName;

	public ProxyImage(String fileName)
	{
		this.fileName = fileName;
	}

	@Override
	public void display()
	{
		if (image == null)
		{
			image = new RealImage(fileName);
		}
		image.display();
	}
}
