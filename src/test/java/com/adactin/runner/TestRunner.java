package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.ConfigurationReader;
import com.adactin.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/adactin/feature/Adactin.feature", glue = "com/adactin/stepdefinition", plugin = {
		/* "pretty", "html:Report/CucumberReport", "json:Report/Cucumber.json", */
		"com.cucumber.listener.ExtentCucumberFormatter:Report/CucumberExtentReport.html" ,
		"rerun:Report/FailedScenario.txt"},
   		//tags = {"~@SmokeTest"},
		monochrome = true, dryRun = false, strict = true)

public class TestRunner {

	/*
	 * private void sample() throws IOException {
	 * 
	 * ConfigurationReader cr = new ConfigurationReader(); cr.getBrowserName();
	 * cr.getUrl();
	 * 
	 * }
	 */
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws IOException {
		String browserName = FileReaderManager .getInstance().getCrInstance().getBrowserName();
		driver = BaseClass.getBrowser(browserName);
	}
	@AfterClass
	public static void teardown() {
		
		driver.close();
	}
	
}
