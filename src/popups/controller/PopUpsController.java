package popups.controller;

import popups.view.PopUpViewer; 

public class PopUpsController 
{
	private PopUpViewer display;
	
	public PopUpsController()
	{
		display = new PopUpViewer();
	}
	
	public void start()
	{
		String answer = "sample";
		while(answer != null && !answer.equals(""))
		{	
			display.displayMessage("Payton you suck!");
			
			answer = display.collectResponse("Does Payton suck?");
			
		}
	}
	
	/** 
	 * Checks a supplied String value to see if can be converted to a double.
	 * @param potentialValue The supplied String
	 * @return Whether the conversion to a double is possible as a boolean value. 
	 */
	private boolean isDouble(String potentialValue)
	{
		boolean validDouble = false;
		
		try
		{
			double testValue = Double.parseDouble(potentialValue); 
			validDouble = true;
		}
		catch(NumberFormatException notDoubleError)
		{
			display.displayMessage("That was not s double =:<");
		}
		
		return validDouble;
	}
	
	/**
	 * Checks the supplied String value to see if it can be converted to an integer.
	 * IF it cannot a popup message is displayed.
	 * @param potentialValue The supplied String
	 * @return whether a conversion to an integer is possible.
	 */
	private boolean isInteger(String potentialValue)
	{
		boolean validInteger = false;
		
		try
		{
			int testValue = Integer.parseInt(potentialValue);
			validInteger = true;
		}
		catch(NumberFormatException notIntegerError)
		{
			display.displayMessage(notIntegerError.getMessage());
			display.displayMessage("You need to type in an int");
		}
	
			return validInteger; 
	}



}
