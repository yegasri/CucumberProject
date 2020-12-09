package com.adactin.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.BookAHotel;
import com.adactin.pom.Bookltinerary;
import com.adactin.pom.HomePage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;
import com.adactin.runner.TestRunner;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition extends BaseClass {

	public static WebDriver driver = TestRunner.driver;
	PageObjectManager pom = new PageObjectManager(driver);
	
	@Before
	public void beforeHooks(Scenario scenario) throws IOException {
		String name = scenario.getName();
		System.out.println("Scenario Name   :  " +name);
		
		}
	
	@After
	public void afterHooks(Scenario scenario) throws IOException {
		String status = scenario.getStatus();
		System.out.println("        Scenario Status:     "+ status);
		if(scenario.isFailed()) {
			screenShot(scenario.getName());
		}
	}
	
	@When("^User log into the application$")
	public void user_log_into_the_application() throws Throwable {
       System.out.println("User launches the application");
	}

	@Given("^User launches the application$")
	public void user_launches_the_application() throws Throwable {

		// driver = getBrowser("chrome");
		// getUrl("http://adactinhotelapp.com/");

		String url = FileReaderManager.getInstance().getCrInstance().getUrl();
		getUrl(url);

	}

	/*
	 * @When("^User enters valid username in username field$") public void
	 * user_enters_valid_username_in_username_field() throws Throwable {
	 * 
	 * HomePage hp =new HomePage(driver); inputElement(hp.getUsername(),"sridhara");
	 * }
	 * 
	 * @When("^User enters valid password in the password field$") public void
	 * user_enters_valid_password_in_the_password_field() throws Throwable {
	 * 
	 * HomePage hp =new HomePage(driver); inputElement(hp.getPassword(),
	 * "adhimary");
	 * 
	 * }
	 */

	@When("^User enters valid \"([^\"]*)\" in username field$")
	public void user_enters_valid_in_username_field(String username) throws Throwable {
		inputElement(pom.getHp().getUsername(), username);
	}

	@When("^User enters valid \"([^\"]*)\" in the password field$")
	public void user_enters_valid_in_the_password_field(String password) throws Throwable {
		inputElement(pom.getHp().getPassword(), password);
	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		clickOnElement(pom.getHp().getLogin());

	}

	@Then("^User verifies whether HomePage navigates to Search Hotel Page$")
	public void user_verifies_whether_HomePage_navigates_to_Search_Hotel_Page() throws Throwable {
		//Assert.assertEquals("A", "a");

	}

	/*
	 * @When("^User selects one of location in dropdown$") public void
	 * user_selects_one_of_location_in_dropdown() throws Throwable { SearchHotel sh=
	 * new SearchHotel(driver); selectDropDown(sh.getLocation(), "Sydney", "value");
	 * 
	 * }
	 */
	@When("^User selects one of \"([^\"]*)\" as \"([^\"]*)\" in dropdown$")
	public void user_selects_one_of_as_in_dropdown(String location, String option) throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		selectDropDown(sh.getLocation(), location, option);

	}

	@When("^User selects one of the hotel in dropdown$")
	public void user_selects_one_of_the_hotel_in_dropdown() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		selectDropDown(sh.getHotels(), "Hotel Creek", " value");

	}

	@When("^User selects the type of room in dropdown$")
	public void user_selects_the_type_of_room_in_dropdown() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		selectDropDown(sh.getRoom_type(), "Standard", "value");

	}

	@When("^User selects number of rooms in dropdown$")
	public void user_selects_number_of_rooms_in_dropdown() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		selectDropDown(sh.getRoom_nos(), "3", "value");

	}

	@When("^User selects number of adults in dropdown$")
	public void user_selects_number_of_adults_in_dropdown() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		selectDropDown(sh.getAdult_room(), "3", "value");

	}

	@When("^User selects number of children in dropdown$")
	public void user_selects_number_of_children_in_dropdown() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		selectDropDown(sh.getChild_room(), "3", "value");

	}

	@When("^User clicks on search button$")
	public void user_clicks_on_search_button() throws Throwable {
		SearchHotel sh = new SearchHotel(driver);
		clickOnElement(sh.getSearch());

	}

	@Then("^User verifies whether SearchHotel page navigates to Select Hotel Page$")
	public void user_verifies_whether_SearchHotel_page_navigates_to_Select_Hotel_Page() throws Throwable {

	}

	@When("^User selects hotel checkbox$")
	public void user_selects_hotel_checkbox() throws Throwable {
		SelectHotel sh = new SelectHotel(driver);
		clickOnElement(sh.getRadiobutton());
	}

	@When("^User clicks on continue button$")
	public void user_clicks_on_continue_button() throws Throwable {
		SelectHotel sh = new SelectHotel(driver);
		clickOnElement(sh.getContinue1());

	}

	@Then("^User verifies whether Select Hotel Page navigates to Book A Hotel Page$")
	public void user_verifies_whether_Select_Hotel_Page_navigates_to_Book_A_Hotel_Page() throws Throwable {

	}

	@When("^User enters first name in firstname field$")
	public void user_enters_first_name_in_firstname_field() throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		inputElement(bh.getFirst_name(), "sri");
	}

	@When("^User enters last name in lastname field$")
	public void user_enters_last_name_in_lastname_field() throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		inputElement(bh.getLast_name(), "soundar");
	}

	@When("^User enters billing address in billing address field$")
	public void user_enters_billing_address_in_billing_address_field() throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		inputElement(bh.getAddress(), "new street");

	}

	@When("^User enters credit cardnumber in field$")
	public void user_enters_credit_cardnumber_in_field() throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		inputElement(bh.getCc_num(), "1111111111111111");

	}

	@When("^User enters credit card type in field$")
	public void user_enters_credit_card_type_in_field() throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		selectDropDown(bh.getCc_type(), "AMEX", "value");

	}

	@When("^User enters expiry month in dropdown$")
	public void user_enters_expiry_month_in_dropdown() throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		selectDropDown(bh.getCc_exp_month(), "3", "value");

	}

	@When("^User enters expiry year in dropdown$")
	public void user_enters_expiry_year_in_dropdown() throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		selectDropDown(bh.getCc_exp_year(), "2022", "value");
	}

	@When("^User enters cvv number in field$")
	public void user_enters_cvv_number_in_field() throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		inputElement(bh.getCc_cvv(), "3214");
	}

	@When("^User clicks on booknow button$")
	public void user_clicks_on_booknow_button() throws Throwable {
		BookAHotel bh = new BookAHotel(driver);
		clickOnElement(bh.getBook_now());

	}

	@Then("^User verifies whether Book A Hotel Page to  Bookltinerary page$")
	public void user_verifies_whether_Book_A_Hotel_Page_to_Bookltinerary_page() throws Throwable {

	}

	@When("^User clicks on myltinerary button$")
	public void user_clicks_on_myltinerary_button() throws Throwable {
		Bookltinerary bl = new Bookltinerary(driver);
		clickOnElement(bl.getMy_itinerary());

	}

	@Then("^User verifies whether Bookltinerary page to Bookeditinerary page$")
	public void user_verifies_whether_Bookltinerary_page_to_Bookeditinerary_page() throws Throwable {

	}

}
