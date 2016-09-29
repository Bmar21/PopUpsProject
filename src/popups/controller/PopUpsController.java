package popups.controller;

import popups.view.PopUpViewer; 
import popups.model.PopUpsModel;
import java.util.List;
import java.util.ArrayList;
 

public class PopUpsController 
{
	private PopUpViewer display;
	private List<PopUpsModel> thingyList;
	
	
	public PopUpsController()
	{
		display = new PopUpViewer();
		thingyList = new ArrayList<PopUpsModel>();
	}
	
	public void start()
	{
		learnLists(); 
		
	}
	
	private void askQuestionLoop()
	{
		String answer = "sample";
		while(answer != null && !isDouble(answer))
		{	
			
			answer = display.collectResponse("you need to type in a double!");
			
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
			display.displayMessage("That was not a double =:<");
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

	private void learnLists()
	{
		display.displayMessage("This is the size of the list: " + thingyList.size());
		PopUpsModel firstThingy = new PopUpsModel();
		thingyList.add(firstThingy);
		PopUpsModel secondThingy = new PopUpsModel();
		thingyList.add(secondThingy);
		display.displayMessage("This is the size of the list: " + thingyList.size());
	}

}
