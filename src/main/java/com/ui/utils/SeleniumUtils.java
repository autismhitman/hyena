package com.ui.utils;

 
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ui.constants.Strategy;
import com.ui.drivers.DriverManager;

public class SeleniumUtils {
	
	  Logger logger =LoggerFactory.getLogger(this.getClass());
	  private WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(40));
	  
	 // public void goToWebSite() {
	//	  DriverManager.getDriver().get(PropertyUtils.getPropertyValues("url"));
	//       DriverManager.getDriver().manage().window().maximize();
	//  }
	  
	  public void click(By locator) {
		  
		  waitStrategy(Strategy.CLICKABLE, locator).click();
	  }
	  
	  public void click(WebElement element) {
		  
		  element.click();
	  }
	  
	  public void enterText(String value, By locator) {
		  
		  waitStrategy(Strategy.PRESENCE, locator).sendKeys(value);
	  }
	  
	  public void clearAndEnterText(String value, By locator) {
		  
		  waitStrategy(Strategy.PRESENCE, locator).clear();
		  enterText(value,locator);
	  }
	  
	  public String captureText(By locator) {
		  
		  return waitStrategy(Strategy.VISIBLE, locator).getText();
		   
	  }
	  
	  public void selectDropdownByText(String value,By locator) {
		   waitStrategy(Strategy.CLICKABLE, locator);
		   Select select = new Select(DriverManager.getDriver().findElement(locator));
		   select.selectByVisibleText(value);
	  }
	  
	  public void selectDropdownByValue(String value,By locator) {
		   waitStrategy(Strategy.CLICKABLE, locator);
		   Select select = new Select(DriverManager.getDriver().findElement(locator));
		   select.selectByValue(value);
	  }
	  
	  public List<WebElement> getListOfWebElements(By locator){
		  waitStrategy(Strategy.PRESENCE, locator);
		  return  DriverManager.getDriver().findElements(locator);
	  }
	  public void scrollToElement(By locator) {
		  
		  new Actions(DriverManager.getDriver()).scrollToElement(
				  DriverManager.getDriver().findElement(locator)).build().perform();
		  
	  }
	  public void scrollActions(By locator) {		  
		   
		  new Actions(DriverManager.getDriver()).scrollToElement(DriverManager.getDriver()
				  .findElement(locator)).build().perform();
		  click(locator);
		  
	  }
	  
	  public void scrollIntoViewClick(By locator) {
		  WebElement element= DriverManager.getDriver().findElement(locator);
		  JavascriptExecutor jse = (JavascriptExecutor) DriverManager.getDriver();
		  jse.executeScript("arguments[0].scrollIntoView(true);", element);
		  element.click();
		  
	  }
	  
	  
	  public void scrollIntoView(By locator) {
		   WebElement element= DriverManager.getDriver().findElement(locator);
		   JavascriptExecutor jse = (JavascriptExecutor) DriverManager.getDriver();
		   jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		   element.click(); 
		  
	  }
	  public void scrollAndClickActions(By locator) {
		  WebElement element= DriverManager.getDriver().findElement(locator);
		  Actions actions = new Actions(DriverManager.getDriver());
		  actions.moveToElement(element).click().build().perform();
	  }
	  
	  public void selectFlights(By locator){
		  
		  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));		  
		  List<WebElement> list= DriverManager.getDriver().findElements(locator);
		   int random= RandomUtils.getValue(3);		  
		  list.get(random).click(); 
		   logger.info("Random value is: "+ random);
	  }
	  
 
	  public WebElement waitStrategy (Strategy strategy, By locator) {
		  
		  WebElement element = null;
		  
		  if(strategy==Strategy.CLICKABLE) {
			  
			 element= wait.until(ExpectedConditions.elementToBeClickable(locator));
		  }
		  else if(strategy==Strategy.VISIBLE) {
			  
			 element= wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		  }
		  else if(strategy==Strategy.PRESENCE) {
			  
			 element= wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		  }
		  else if(strategy==Strategy.NONE) {
			  
			  element = DriverManager.getDriver().findElement(locator);
		  }
		  return element;
		  
	  }
}
