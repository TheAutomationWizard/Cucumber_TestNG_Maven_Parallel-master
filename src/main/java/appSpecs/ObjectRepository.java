package appSpecs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public interface ObjectRepository {

	
	
//  ---------------------------------------     SignIn Page     -------------------------------------------------------   

	By		USERID						=	By.name("uid"),
			PWD							=	By.name("password"),
			LOGIN						=	By.name("btnLogin");

	
	
//  ---------------------------------------     Home Page     -------------------------------------------------------   
	
	By 		Home_button 				=	By.cssSelector("div > button[ class = 'btn home']"),
			Customer_Login 				= 	By.xpath("(//div/button)[3]"),
			Bank_Manager_Login			= 	By.cssSelector("div button:nth-of-type(1)");
	
	
	
	
//	---------------------------------------     Manager Page     ------------------------------------------------------        

	By     	NEW_CUSTOMER				= 	By.xpath("//li/a[text()='New Customer']"),
			CUSTOMER_NAME				=	By.xpath("//td/input[@name='name']"),
			LOG_OUT						=	By.xpath("//li/a[text()='Log out']");
	
	

	
//	---------------------------------------     Welcome Page     ------------------------------------------------------        

	By		UserName					=	By.cssSelector("strong > span");
	
	
	
	
	
	
//	---------------------------------------     Customer Page     ------------------------------------------------------        
	
	By		YourName					=	By.id("userSelect"),
			Login						=	By.cssSelector("button[type='submit']"),
			User_dropdown 				= 	By.id("userSelect"),
			LoginButton 				=	By.cssSelector("button[type='submit']");

	
	
	
	
	
	
	
	
}
