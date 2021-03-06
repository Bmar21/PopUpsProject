package popups.view;

import javax.swing.JOptionPane;

/**
 * Popup display class with three methods for GUI
 * @author Brandon Marlor
 * @version September 27, 2016
 */
public class PopUpViewer 
{
	
	/**
	 * Creates a popup to show the user s String.
	 * @param message the String to show the user.
	 */
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	
	/**
	 * Creates a popup to ask a question to the user. Stores the response as a String. 
	 * @param question The question supplied to the user.
	 * @return The users response as a String. 
	 */
	public String collectResponse(String question)
	{
		String response = "";
		
		response = JOptionPane.showInputDialog(null, question);
		
		return response;
	}
	
	/**
	 * Creates a popup to prompt user to choose yes/no/cancel to the supplied question.
	 * @param question The question being asked.
	 * @return The JOptionPane constant value for yes/no/cancel
	 */
	public int collectOption(String question)
	{
		int optionNumber = 0;
		
		optionNumber = JOptionPane.showConfirmDialog(null, question);
			
		return optionNumber;
	}

}
