import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class SpamBot {
	public static void main(String[] args) throws AWTException, InterruptedException {
	Scanner myObj = new Scanner(System.in);
	System.out.print("Enter Spam Text:");
	
	String SpamText = myObj.nextLine();
	
	//copy the text to the clipboard
	StringSelection stringsel = new StringSelection(SpamText);
	Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	clipboard.setContents(stringsel, null);
	
	System.out.println("Hurry, Spamming starts soon");
	Thread.sleep(4000);// Delay Between msgs
	
	Robot rob= new Robot();
	for(int i=0;i<5;i++)
	{
		Thread.sleep(1000);// Delay Between msgs
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	}
	}
}
