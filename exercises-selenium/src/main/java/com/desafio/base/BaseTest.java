package com.desafio.base;

import static com.desafio.core.DriverFactory.getDriver;
import static com.desafio.core.DriverFactory.killDriver;
import static com.desafio.core.Propriedades.FECHA_BROWSER;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BaseTest {
	
	@BeforeClass
	public static void setUpAll(){
		getDriver().manage().deleteAllCookies();
//		getDriver().manage().window().maximize();
	}
	
	@Rule
	public TestName testName = new TestName();
	
	@After
	public void tearDown() throws IOException {
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("target"+ File.separator +"screenshot"+ 
							File.separator + testName.getMethodName() + ".jpg"));
		
		if(FECHA_BROWSER) {
			killDriver();
		}
	}
	
}
