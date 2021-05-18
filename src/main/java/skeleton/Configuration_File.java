package skeleton;

public interface Configuration_File {

	
	//**********************************     Handle the Browser From Here   *********************
	long 		IMPLICIT_WAIT 			= 30;
	boolean 	BROWSER_CONTROL 		= false;			// To have singular browser automation over suite.
	String 		BROWSER_NAME 			= "chrome";		// Browser to be used for all test scripts.
	int			OBJECT_LOAD_TIME_OUT 	= 300;
	int			PAGE_LOAD_TIME_OUT 		= 300;
	
	String		CHROME_DRIVER			= "./src/main/resources/Executables/chromedriver.exe";
	String 		FIREFOX_DRIVER			= "./src/main/resources/Executables/geckodriver.exe";
	String 		IE_DRIVER				="./src/main/resources/Executables/IEDriverServer.exe";
	
	
//	String 		URL						= "http://www.way2automation.com/angularjs-protractor/banking/#/login";
	String 		URL						= "http://demo.guru99.com/V4/index.php#";
	
	
	
	
	
}
