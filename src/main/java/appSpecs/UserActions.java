package appSpecs;

import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import skeleton.BaseTest;
import skeleton.Dropdowns;

public class UserActions implements ObjectRepository{

//	BaseTest  Basic 	=	new BaseTest();
	Dropdowns dd 		= 	new Dropdowns();
	
	
// =====================>  Home Page Actions    <======================	
	
	public void click_on_Home() 
	{
		BaseTest.browser.get().findElement(Home_button).click();
		System.out.println("Clicked on Home Button");
	}

	
	
	
	public void click_on_BankManager()
	{
		BaseTest.browser.get().findElement(Bank_Manager_Login).click();
		System.out.println("Clicked on Bank Manager Button");
	}

	
	
	public void click_on_CustomerLogin()
	{
		WebDriverWait waits = new WebDriverWait(BaseTest.browser.get(), Duration.ofSeconds(60));
		waits.until(ExpectedConditions.visibilityOf(BaseTest.browser.get().findElement(Customer_Login)));

		BaseTest.browser.get().findElement(Customer_Login).click();
		System.out.println("Clicked on Bank Customer Login Button");
	}
	
	
	
	
	
// =====================>  Bank Manager Page Actions    <=====================	
	

	public  void EnterCustomer_Name(String CustomerName)
	{
		BaseTest.browser.get().findElement(NEW_CUSTOMER).click();
		BaseTest.browser.get().findElement(CUSTOMER_NAME).sendKeys(CustomerName);
		System.out.println("Entered Customer Name");
	}
	
	public void Log_Out()
	{
		BaseTest.browser.get().findElement(LOG_OUT).click();
		BaseTest.browser.get().switchTo().alert().accept();
	}

	
	
	
	
	
	
// =====================>  WelcomePage Actions    <=====================	
	
	
	
	public void returnToUserSelection(String Username) throws InterruptedException 
	{
		WebDriverWait waits = new WebDriverWait(BaseTest.browser.get(), Duration.ofSeconds(60));
		waits.until(ExpectedConditions.visibilityOf(BaseTest.browser.get().findElement(UserName)));

		BaseTest.browser.get().navigate().back();	
		Select_Customer_and_Login(	Username	);
	}

	
	
// =====================>  Customer Page Login Actions    <=====================	
	
	
	public void Select_Customer_and_Login( String CustomerName ) throws InterruptedException
	
	{
		WebDriverWait waits = new WebDriverWait(BaseTest.browser.get(), Duration.ofSeconds(60));		

		System.out.println("Selecting customer ==> "+CustomerName);
		
			waits.until(ExpectedConditions.visibilityOf(BaseTest.browser.get().findElement(YourName)));
			dd.selectByVisibleText(CustomerName, YourName);	
			System.out.println("Customer selected succesfully");
			
			waits.until(ExpectedConditions.visibilityOf(BaseTest.browser.get().findElement(Login)));
			BaseTest.browser.get().findElement(Login).click();
			System.out.println("Customer logged in succesfully");
	
	}

	
	
	
	
	public void Login_as_User(String UserID, String PASSWORD) {
		BaseTest.browser.get().findElement(USERID).sendKeys(UserID);
		BaseTest.browser.get().findElement(PWD).sendKeys(PASSWORD);
		BaseTest.browser.get().findElement(LOGIN).click();
		System.out.println("User Login Done.");
	}

	
// =====================>  Manager Page Actions    <=====================	
	


	
	
	
	
	
	
	
}
