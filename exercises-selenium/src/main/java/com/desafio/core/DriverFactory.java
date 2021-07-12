package com.desafio.core;

import static com.desafio.core.Propriedades.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DriverFactory {

	private static WebDriver driver;
	
	private DriverFactory() {}
	
	public static WebDriver getDriver() {
		if(driver == null) {
			switch (browser) {
				case CHROME: driver = new ChromeDriver(); break;
				case FIREFOX: driver = new FirefoxDriver(); break;
				case OPERA: driver = new OperaDriver(); break;
//				case EDGE: driver = new EdgeDriver(); break;
				case IE: driver = new InternetExplorerDriver(); break;
			}
		}
		return driver;
	}
	
	public static void killDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
