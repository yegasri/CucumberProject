package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	
	public static WebDriver driver;
	
	@FindBy(id="radiobutton_1")
	private WebElement radiobutton;
	
	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinue1() {
		return continue1;
	}

	@FindBy(id="continue")
	private WebElement continue1;
	
	public SelectHotel (WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

}
