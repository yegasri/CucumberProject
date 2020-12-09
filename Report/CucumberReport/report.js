$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Booking functionality of Adactin Application",
  "description": "",
  "id": "booking-functionality-of-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify the user is able to login application",
  "description": "",
  "id": "booking-functionality-of-adactin-application;verify-the-user-is-able-to-login-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters valid \"sridhara\" in username field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters valid \"adhimary\" in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User verifies whether HomePage navigates to Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launches_the_application()"
});
formatter.result({
  "duration": 3395735866,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sridhara",
      "offset": 19
    }
  ],
  "location": "StepDefinition.user_enters_valid_in_username_field(String)"
});
formatter.result({
  "duration": 529608004,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "adhimary",
      "offset": 19
    }
  ],
  "location": "StepDefinition.user_enters_valid_in_the_password_field(String)"
});
formatter.result({
  "duration": 245208237,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 2056573161,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_HomePage_navigates_to_Search_Hotel_Page()"
});
formatter.result({
  "duration": 934832,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Verify the user is able to search hotels",
  "description": "",
  "id": "booking-functionality-of-adactin-application;verify-the-user-is-able-to-search-hotels",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "User selects one of \"Sydney\" as \"value\" in dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User selects one of the hotel in dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User selects the type of room in dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User selects number of rooms in dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User selects number of adults in dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User selects number of children in dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User clicks on search button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User verifies whether SearchHotel page navigates to Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Sydney",
      "offset": 21
    },
    {
      "val": "value",
      "offset": 33
    }
  ],
  "location": "StepDefinition.user_selects_one_of_as_in_dropdown(String,String)"
});
formatter.result({
  "duration": 475527586,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_one_of_the_hotel_in_dropdown()"
});
formatter.result({
  "duration": 1948350,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_the_type_of_room_in_dropdown()"
});
formatter.result({
  "duration": 245870232,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_number_of_rooms_in_dropdown()"
});
formatter.result({
  "duration": 228953022,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_number_of_adults_in_dropdown()"
});
formatter.result({
  "duration": 220332127,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_number_of_children_in_dropdown()"
});
formatter.result({
  "duration": 285153277,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_search_button()"
});
formatter.result({
  "duration": 1103396442,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_SearchHotel_page_navigates_to_Select_Hotel_Page()"
});
formatter.result({
  "duration": 57732,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Verify the user is able to select hotel",
  "description": "",
  "id": "booking-functionality-of-adactin-application;verify-the-user-is-able-to-select-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "User selects hotel checkbox",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User clicks on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User verifies whether Select Hotel Page navigates to Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_selects_hotel_checkbox()"
});
formatter.result({
  "duration": 242864315,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_continue_button()"
});
formatter.result({
  "duration": 796941312,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_Select_Hotel_Page_navigates_to_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 64575,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Verify the user is able to book a hotel",
  "description": "",
  "id": "booking-functionality-of-adactin-application;verify-the-user-is-able-to-book-a-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "User enters first name in firstname field",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "User enters last name in lastname field",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User enters billing address in billing address field",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User enters credit cardnumber in field",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User enters credit card type in field",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User enters expiry month in dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User enters expiry year in dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "User enters cvv number in field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User clicks on booknow button",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User verifies whether Book A Hotel Page to  Bookltinerary page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_enters_first_name_in_firstname_field()"
});
formatter.result({
  "duration": 408461299,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_last_name_in_lastname_field()"
});
formatter.result({
  "duration": 323386025,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_billing_address_in_billing_address_field()"
});
formatter.result({
  "duration": 288464960,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_credit_cardnumber_in_field()"
});
formatter.result({
  "duration": 326398784,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_credit_card_type_in_field()"
});
formatter.result({
  "duration": 236409441,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_expiry_month_in_dropdown()"
});
formatter.result({
  "duration": 212030253,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_expiry_year_in_dropdown()"
});
formatter.result({
  "duration": 211881861,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_cvv_number_in_field()"
});
formatter.result({
  "duration": 227576433,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_booknow_button()"
});
formatter.result({
  "duration": 201856578,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_Book_A_Hotel_Page_to_Bookltinerary_page()"
});
formatter.result({
  "duration": 71845,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "Verify the user is able to bookltinerary",
  "description": "",
  "id": "booking-functionality-of-adactin-application;verify-the-user-is-able-to-bookltinerary",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 43,
  "name": "User clicks on myltinerary button",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "User verifies whether Bookltinerary page to Bookeditinerary page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_myltinerary_button()"
});
formatter.result({
  "duration": 6863619725,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_Bookltinerary_page_to_Bookeditinerary_page()"
});
formatter.result({
  "duration": 71844,
  "status": "passed"
});
});