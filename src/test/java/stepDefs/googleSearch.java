package stepDefs;

import org.openqa.selenium.WebDriver;
import appSpecs.UserActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import skeleton.BaseTest;
import skeleton.BaseTest.UnknwonBrowserException;
import skeleton.Configuration_File;


public class googleSearch{

//	private WebDriver 				testDriver;
	ThreadLocal<WebDriver>          testDriver;
	private UserActions				actions 	= new UserActions();
	private BaseTest 				Basic		= new BaseTest();
	
	static final String UserID 		= 	"mngr249007";
	static final String PASSWORD 	=	"utYdEqe";


	// Hooks for the Step definitions .....
	@Before
	public void before(Scenario scenario) {
	    System.out.println("------------------------------------------------------------");
	    System.out.println("Starting execution of scenario - " + scenario.getName()+" using Thread "+Thread.currentThread().getId());
	    System.out.println("------------------------------------------------------------");
	}
	
	@After
	public void after(Scenario scenario) {
	    System.out.println("Killed current browser instance. Reopen for new scenario.");
	    System.out.println("------------------------------------------------------------");
	    System.out.println("Scenario - " + scenario.getName()+" completed using Thread "+Thread.currentThread().getId()+" with status \""+ scenario.getStatus()+"\"");	
	    System.out.println("------------------------------------------------------------");
//	    testDriver.quit();
//	    testDriver.close();
	    testDriver.get().close();
	}

	// @Given statements for Step Definitions
	
	@Given("^When i run this$")
	public void a() {
		System.out.println("1");
	}
	
	@Given("^Launch website \"([^\"]*)\"$")
	public void setUp(String browserName) throws UnknwonBrowserException {
		System.out.println("Browser launch and setup started.");
//		testDriver	=	Basic.setDriver(browserName);
		testDriver.set(Basic.setDriver(browserName));
		System.out.println(testDriver.toString());
//		testDriver.get(Configuration_File.URL);
		testDriver.get().get(Configuration_File.URL);
	}
	
	@Given("^Customer Enters Credential and Login$")
	public void Customer_Launches_Application(){
		System.out.println(testDriver.toString());
		actions.Login_as_User(UserID, PASSWORD);
		System.out.println("Customer entered credentials.");
	}
	

	
	@When("^New Customer \"([^\"]*)\" entered$")
	public void Customer_Clicks_on_Customer_Login_Button(String CustomerName) {
		System.out.println(testDriver.toString());
		System.out.println("Entering Customer Name : "+UserID);
		actions.EnterCustomer_Name(UserID);
	}

	
	
	@Then("^Customer Log outs$")
	public void Customer_Log_outs() 
	{
		
	}
	
	
	
	
	
	
	
	
	
}
