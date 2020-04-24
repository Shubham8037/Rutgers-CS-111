import javax.swing.JOptionPane;

public class GIO
{
   
	public static String readString(String prompt)
	{
		return JOptionPane.showInputDialog(prompt);
	}

	
	public static boolean readBoolean(String prompt)
	{
		int i = JOptionPane.showConfirmDialog(null, prompt, "Blackjack", JOptionPane.YES_NO_OPTION);
		return i == JOptionPane.YES_OPTION;
	}
	
	
	public static int readInt(String prompt)
	{
		String s = JOptionPane.showInputDialog(prompt);
		
		while (true)
		{
			try
			{
				return Integer.parseInt(s);
			}
			catch (NumberFormatException e)
			{
				s = JOptionPane.showInputDialog("That is not an integer.  Enter again: ");
			}
		}
	}
	
	
	public static void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}

	private GIO() {}
}
