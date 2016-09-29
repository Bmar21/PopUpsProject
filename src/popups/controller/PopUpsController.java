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
		boolean vaildDouble = false;
		
		try
		{
			double testValue = Double.parseDouble(potentialValue); 
			validDouble = true;
		}
		catch(NumberFormatException notDoubleError)
		{
			display.displayMessage("That was not s double =:<");
		}
		
		return vaildDouble;
	}




}
