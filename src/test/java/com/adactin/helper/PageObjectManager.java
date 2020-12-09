package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookAHotel;
import com.adactin.pom.Bookltinerary;
import com.adactin.pom.HomePage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;

public class PageObjectManager {

	public static WebDriver driver;

	private BookAHotel bh;
	private Bookltinerary bl;
	private HomePage hp;
	private SearchHotel sh;
	private SelectHotel sl;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}

	public HomePage getHp() {
		hp = new HomePage(driver);
		return hp;
	}

	public SearchHotel getSh() {
		sh = new SearchHotel(driver);
		return sh;
	}

	public SelectHotel getSl() {
		sl = new SelectHotel(driver);
		return sl;
	}

	public BookAHotel getBh() {
		bh = new BookAHotel(driver);
		return bh;
	}

	public Bookltinerary getBl() {
		bl = new Bookltinerary(driver);
		return bl;
	}

}
