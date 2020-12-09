package com.adactin.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getBrowser(String browserName) {

		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\admin\\eclipse-workspace\\Student\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else {
				System.out.println("invalid BrowserName");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	public static void getUrl(String url) {
		try {
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void waitForElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void clickOnElement(WebElement element) {
		waitForElement(element);
		try {
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void inputElement(WebElement element, String userName) {
		try {
			waitForElement(element);
			element.sendKeys(userName);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void moveToElement(WebElement element) {
		waitForElement(element);
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void clickElement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
		ac.click(element).perform();
	}

	public static void selectDropDown(WebElement element, String value, String option) {
		if (option.equalsIgnoreCase("value")) {
			Select s = new Select(element);
			s.selectByValue(value);
		} else if (option.equalsIgnoreCase("text")) {
			Select s = new Select(element);
			s.selectByVisibleText("text");
		} else if (option.equalsIgnoreCase("index")) {
			Select s = new Select(element);
			s.selectByIndex(Integer.parseInt(value));
		}
	}

	public static void switchToFrameUsingId(String option, int index) {
		try {
			if (option.equalsIgnoreCase("id")) {
				driver.switchTo().frame(index);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void switchToFrameUsingName(String option, String name) {
		try {
			if (option.equalsIgnoreCase("Framename")) {
				driver.switchTo().frame(name);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void close() {
		driver.close();
	}

	public static void windowHandle(String option) {
		if (option.equalsIgnoreCase("parentwindow")) {
			String pId = driver.getWindowHandle();
			System.out.println(pId);
			String pTitle = driver.switchTo().window(pId).getTitle();
			System.out.println(pTitle);
		} else if (option.equalsIgnoreCase("Allwindows")) {
			Set<String> allId = driver.getWindowHandles();
			for (String id : allId) {
				String allTitle = driver.switchTo().window(id).getTitle();
				System.out.println(allTitle);

			}
		}
	}

	public static void screenShot(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File f = new File(System.getProperty("user.dir") + "\\Screenshot\\" + filename + ".png");
		FileUtils.copyFile(srcFile, f);
	}

}
