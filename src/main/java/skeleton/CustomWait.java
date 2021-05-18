package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWait extends BaseTest{
	
	WebDriverWait wait;
	
	public void forElementVisibility(WebElement webelement) {
		wait = new WebDriverWait(browser.get(), OBJECT_LOAD_TIME_OUT);
		wait.until(ExpectedConditions.visibilityOf(webelement));
	} 
	
	public void forElementVisibility(WebElement webelement, int customTimeout) {
		wait = new WebDriverWait(browser.get(), customTimeout);
		wait.until(ExpectedConditions.visibilityOf(webelement));
	} 
	
	public void forElementInVisibility(By locator) throws InterruptedException {
		wait = new WebDriverWait(browser.get(), OBJECT_LOAD_TIME_OUT);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}
	
	public void forElementInVisibility(By locator, int customTimeout) throws InterruptedException {
		wait = new WebDriverWait(browser.get(), customTimeout);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	}
	
	public void forAlertToBePresent() {
		wait = new WebDriverWait(browser.get(), OBJECT_LOAD_TIME_OUT);
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public void forAlertToBePresent(int customTimeout) {
		wait = new WebDriverWait(browser.get(), customTimeout);
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public void forPageTitle(String pagetitle) {
		wait = new WebDriverWait(browser.get(), OBJECT_LOAD_TIME_OUT);
		wait.until(ExpectedConditions.titleIs(pagetitle));
	}
	
	public void forPageTitle(String pagetitle, int customTimeout) {
		wait = new WebDriverWait(browser.get(), customTimeout);
		wait.until(ExpectedConditions.titleIs(pagetitle));
	}
	
	public void forPageToLoad(WebElement webelement) {
		wait = new WebDriverWait(browser.get(), PAGE_LOAD_TIME_OUT);
		wait.until(ExpectedConditions.visibilityOf(webelement));
	}
	
	public void forPageToLoad(WebElement webelement, int customTimeout) {
		wait = new WebDriverWait(browser.get(), customTimeout);
		wait.until(ExpectedConditions.visibilityOf(webelement));
	}
	
	public void forPageToLoad(String pageTitle) {
		wait = new WebDriverWait(browser.get(), PAGE_LOAD_TIME_OUT);
		wait.until(ExpectedConditions.titleIs(pageTitle));
	}
	
	public void forPageToLoad(String pageTitle, int customTimeout) {
		forPageTitle(pageTitle,customTimeout);
	}
	
	public void forTextToBePresent(String text){
		text.trim();
		int count = 0;
		boolean flag = false;
		do {
			if(browser.get().getPageSource().contains(text)) {
				flag = true;
				break;
			} else {
				count++;
				forXseconds(1);
			}
		} while (count < OBJECT_LOAD_TIME_OUT);
		
		if(!flag) {
			throw new TimeoutException("Search text not found on the webpage after timeout period of "+OBJECT_LOAD_TIME_OUT+" secs");
		}
	}
	
	public void forTextToBePresent(String text, int customTimeout){
		text.trim();
		int count = 0;
		boolean flag = false;
		do {
			if(browser.get().getPageSource().contains(text)) {
				flag = true;
				break;
			} else {
				count++;
				forXseconds(1);
			}
		} while (count < customTimeout);
		
		if(!flag) {
			throw new TimeoutException("Search text not found on the webpage after timeout period of "+customTimeout+" secs");
		}
	}
	
	public void forElementToBeEnabled(WebElement webelement) {
		int count = 0;
		boolean flag = false;
		do {
			if(webelement.isEnabled()) {
				flag = true;
				break;
			} else {
				count++;
				forXseconds(1);
			}
		} while (count < OBJECT_LOAD_TIME_OUT);
		
		if(!flag) {
			throw new ElementNotInteractableException("Element disabled");
		}
	}
	
	public void forElementToBeEnabled(WebElement webelement, int customTimeout) {
		int count = 0;
		boolean flag = false;
		do {
			if(webelement.isEnabled()) {
				flag = true;
				break;
			} else {
				count++;
				forXseconds(1);
			}
		} while (count < customTimeout);
		
		if(!flag) {
			throw new ElementNotInteractableException("Element disabled");
		}
	}
	
	public void forElementToBeVisibleAndEnabled(WebElement webelement) {
		forElementVisibility(webelement);
		forElementToBeEnabled(webelement);
	}	
	
	public void forElementToBeVisibleAndEnabled(WebElement webelement, int customTimeout) {
		forElementVisibility(webelement,customTimeout);
		forElementToBeEnabled(webelement,customTimeout);
	}
	
	public void forXseconds(int seconds) {
		seconds = seconds * 1000;
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
} 