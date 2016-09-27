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

}
