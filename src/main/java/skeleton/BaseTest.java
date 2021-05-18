package skeleton;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;


public class BaseTest implements Configuration_File{


	public static	ThreadLocal<WebDriver> browser = new ThreadLocal<WebDriver>();
	

	@BeforeSuite
	public void SuiteStarter() {
		
		System.out.println("**************************    Performing pre-execution setups   *********************");
			
	}

	
	
	public WebDriver setDriver(String Browser_Name) throws UnknwonBrowserException {

		browser.remove();
		if (BROWSER_CONTROL) {
			System.out.println("Test Execution is being done on Browser Type: "+Browser_Name);
				if(BROWSER_NAME.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver", CHROME_DRIVER);

					ChromeOptions options = new ChromeOptions();
					options.addArguments("--disable-extensions");
					options.addArguments("--log-level=3");
					options.addArguments("--ignore-certificate-errors");
					
					ChromeDriverService service = new ChromeDriverService.Builder()
				            .usingAnyFreePort()
				            .withSilent(true)
				            .withVerbose(false)
				            .withWhitelistedIps("")
				            .build();
					
					browser.set(new ChromeDriver(service, options));

					
//					browser.set(new ChromeDriver());
				}
				else if(BROWSER_NAME.equalsIgnoreCase("firefox") || BROWSER_NAME.equalsIgnoreCase("ff") ) {
					System.setProperty("webdriver.gecko.driver", FIREFOX_DRIVER);
					browser.set(new FirefoxDriver());
				}
				else if (BROWSER_NAME.equalsIgnoreCase("ie") || BROWSER_NAME.equalsIgnoreCase("internet explorer")	) {
					System.setProperty("webdriver.ie.driver", IE_DRIVER);
					browser.set(new InternetExplorerDriver());
				}
				else throw new UnknwonBrowserException("Browser type is not known to us or is not automatable.");
		}
		
		else {
			System.out.println("Test execution is being done on Browser Type: "+Browser_Name);
			if(Browser_Name.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", CHROME_DRIVER);
				browser.set(new ChromeDriver());
			}
			else if(Browser_Name.equalsIgnoreCase("firefox") || Browser_Name.equalsIgnoreCase("ff") ) {
				System.setProperty("webdriver.gecko.driver", FIREFOX_DRIVER);
				browser.set(new FirefoxDriver());
			}
			else if (Browser_Name.equalsIgnoreCase("ie") || Browser_Name.equalsIgnoreCase("internet explorer")	) {
				System.setProperty("webdriver.ie.driver", IE_DRIVER);
				browser.set(new InternetExplorerDriver());
			}
			else throw new UnknwonBrowserException("Browser type is not known to us or is not automatable.");
			
		}
		browser.get().manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		return browser.get();

	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public class UnknwonBrowserException extends Exception {

		private static final long serialVersionUID = 1L;
 
		public UnknwonBrowserException( String message) {
			super(message);
		}
	}
	



}



























