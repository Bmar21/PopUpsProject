package popups.model;

public class PopUpsModel 
{
	private int number;
	private double value;
	private String words;
	private boolean isValid;
	
	//no constructors 
	//write all get/set
	
	public int getNmuber()
	{
		return number;
	}
	public double getValue()
	{
		return value;
	}
	public String getWords()
	{
		return words;
	}
	public boolean getIsValid()
	{
		return isValid;
	}
	
	public void setNumber(int number)
	{
		this.number = number;
	}
	public void setValue(double value)
	{
		this.value = value;
	}
	public void setWords(String words)
	{
		this.words = words;
	}
	public void setValid(boolean isValid)
	{
		this.isValid = isValid;
	}

}
