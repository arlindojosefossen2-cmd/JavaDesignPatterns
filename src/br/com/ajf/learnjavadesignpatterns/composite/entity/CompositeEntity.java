package br.com.ajf.learnjavadesignpatterns.composite.entity;

public final class CompositeEntity
{
	private final CoarseGrainedObject coarseGrainedObject = new CoarseGrainedObject();

	public void setData(String data1,String data2)
	{
		coarseGrainedObject.setData(data1,data2);
	}

	public String[] getData()
	{
		return coarseGrainedObject.getData();
	}
}
