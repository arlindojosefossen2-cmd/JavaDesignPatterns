package br.com.ajf.learnjavadesignpatterns.proxy;

public record RealImage(String fileName) implements Image
{
	public RealImage(String fileName)
	{
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	private void loadFromDisk(String fileName)
	{
		System.out.println("Loading Image..." + fileName);
	}

	@Override
	public void display()
	{
		System.out.println("Real Image " + this.fileName);
	}
}
