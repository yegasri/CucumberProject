package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookltinerary {
	
	public static WebDriver driver;
	
	@FindBy(id="my_itinerary")
	private WebElement my_itinerary;

	public WebElement getMy_itinerary() {
		return my_itinerary;
	}
	
	public Bookltinerary (WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

}
