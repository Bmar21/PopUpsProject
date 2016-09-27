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
		int count = 0;
		while(count < 10)
		{	
			display.displayMessage("Payton you suck!");
			
			String answer = display.collectResponse("Do you like bannanas?");
			
			count++;
		}
	}

}
