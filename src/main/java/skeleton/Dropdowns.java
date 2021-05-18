package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns extends BaseTest{

	
	/**
	 * selectByValue  	= Functionality => Selects option from Dropdown based on value
	 * @param value		= String value to be selected from the dropdown
	 * @param dropdown	= Dropdown WebElement with select tag
	 */
	public void selectByValue(String value, WebElement dropdown) {
		try {	new Select(dropdown).selectByValue(value); }
		catch (	Exception e )	{System.out.println("Failed to Select from Dropdown");}
	
	}
	public void selectByValue(String value, By dropdown) {
		try {	new Select(browser.get().findElement(dropdown)).selectByValue(value); }
		catch (	Exception e )	{System.out.println("Failed to Select from Dropdown");}
	
	}
	

	
	
	
	/**
	 * selectByIndex	= Functionality => Selects option from Dropdown based on its index
	 * @param value		= int index of the option to be selected from the dropdown
	 * @param dropdown	= Dropdown WebElement with select tag
	 */
	public void selectByIndex(int index, WebElement dropdown) {
		try {	new Select (dropdown).selectByIndex(index);	}
		catch (	Exception e )	{System.out.println("Failed to Select from Dropdown");}
	
	}

	public void selectByIndex(int index, By dropdown) {
		try {	new Select(browser.get().findElement(dropdown)).selectByIndex(index);	}
		catch (	Exception e )	{System.out.println("Failed to Select from Dropdown");}
	
	}

	
	
	
	
	/**
	 * selectByVisibleText	= Functionality => Selects option from Dropdown based on its text
	 * @param value			= String text of the option to be selected from the dropdown
	 * @param dropdown		= Dropdown WebElement with select tag
	 */
	public void selectByVisibleText(String text, WebElement dropdown) {
		try {	new Select (dropdown).selectByVisibleText(text);	}
		catch (	Exception e )	{System.out.println("Failed to Select from Dropdown");}
	
	}
	
	public void selectByVisibleText(String text, By dropdown) {
		try {	new Select(browser.get().findElement(dropdown)).selectByVisibleText(text);	}
		catch (	Exception e )	{System.out.println("Failed to Select from Dropdown");}
	
	}
	
	
	
	
	

}
