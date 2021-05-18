import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.api.testng.CucumberFeatureWrapper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


//features			= "C:/Aditya Kumar/Eclipse-R&D-Workspace/Bdd/src/test/resources/features/CustomerLogin2.feature",
//features			= "classpath:features",

@CucumberOptions(
		features			= "C:/Aditya Kumar/Eclipse-R&D-Workspace/Bdd/src/test/resources/features/googleSearch2.feature",
		glue				= {"stepDefs"},
        tags 				= {"~@Ignore"},
        format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        },
		monochrome 	= true, //display the console output in a proper readable format
		strict 		= true	//it will check if any step is not defined in step definition file

		)


public class RunnerTwo{
    private TestNGCucumberRunner testNGCucumberRunner;
 
    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception
    {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
 
    
    @Test(groups = "cucumber", threadPoolSize= 1, description = "Runs Cucumber Feature", dataProvider = "getfeatures")
    public void feature(CucumberFeatureWrapper cucumberFeature)
    {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }
 
    @DataProvider(parallel = false)
    public Object[][] getfeatures() {
        return testNGCucumberRunner.provideFeatures();
    }
 
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();
    }
}