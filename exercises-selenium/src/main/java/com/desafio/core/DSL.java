package com.desafio.core;

import static com.desafio.core.DriverFactory.getDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//DSL = domain-specific language
public class DSL {

	public String getHtmlLang() {
		return getDriver().findElement(By.tagName("html")).getAttribute("lang");
	}
	
	public void hoverDropdown(String xpath) {
		WebElement menuList = getDriver().findElement(By.xpath(xpath));
		Actions action = new Actions(getDriver());
		action.pause(1000).moveToElement(menuList).build().perform();
	}
	
	public void setText(String text, String xpath) {
		getDriver().findElement(By.xpath(xpath)).sendKeys(text);
	}
	
	public void pressEnter(String xpath) {
		getDriver().findElement(By.xpath(xpath)).sendKeys(Keys.ENTER);
	}
	
	public void click(By by) {
		getDriver().findElement(by).click();
	}
	
	public void clickButton(String xpath) {
		WebElement button = getDriver().findElement(By.xpath(xpath));
		Actions action = new Actions(getDriver());
		action.pause(1000).moveToElement(button).click().build().perform();
	}
	
	public String getText(By by) {
		return getDriver().findElement(by).getText();
	}
	
	public String getText(String xpath) {
		return getText(By.xpath(xpath));
	}
	
	public List<String> getListText(String xpath) {
		List<WebElement> listWeb = getDriver().findElements(By.xpath(xpath));
		List<String> listString = new ArrayList<String>();
		for(WebElement element: listWeb)
			listString.add(element.getText());
		return listString;
	}
	
	public String getRandomElementInList(String xpath) {
		List<WebElement> listWeb = getDriver().findElements(By.xpath(xpath));
		Random random = new Random();
		WebElement element = listWeb.get(random.nextInt(listWeb.size()));
		return element.getText();
	}
	
	public WebElement getElement(By by) {
		return getDriver().findElement(by);
	}
	
	public WebElement getElement(String xpath) {
		return getElement(By.xpath(xpath));
	}
	
	public void waitPresenceElement(String xpath, Integer time) {
		WebDriverWait wait = new WebDriverWait(getDriver(), time);
		// aguarda o elemento estar disponível
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
	}
	
	public void waitClickableElement(String xpath, Integer time) {
		WebDriverWait wait = new WebDriverWait(getDriver(), time);
		// aguarda o elemento estar disponível
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	}
	
	public void executeJS(String cmd, Object... param) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript(cmd, param);
	}
	
	public boolean isElementPresent(String xpath) {
		return ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)) != null;
	}
	
	public boolean isElementDisplayed(String xpath) {
		return getDriver().findElement(By.xpath(xpath)).isDisplayed();
	}
	
	public boolean isElementExists(String xpath) {
		return getDriver().findElements(By.xpath(xpath)).size()>0;
	}
	
	public void searchAndClickElement(String xpath) {
		WebElement button = getElement(By.xpath(xpath));
		// rola até o elemento, caso não esteja visível na tela
		if(!isElementPresent(xpath))
			executeJS("window.scrollTo(0, arguments[0])", button.getLocation().y);
		clickButton(xpath);
	}
	
	public void switchTab() {
		for(String winHandle : getDriver().getWindowHandles())
			getDriver().switchTo().window(winHandle);
	}
}
