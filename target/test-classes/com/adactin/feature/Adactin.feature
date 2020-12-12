Feature: Booking functionality of Adactin Application

Background:
   Given User launches the application
   When User log into the application

@SmokeTest
Scenario Outline: Verify the user is able to login application

   Given User launches the application
   When User enters valid "<username>" in username field
   And User enters valid "<password>" in the password field
   And User clicks on the login button
   Then User verifies whether HomePage navigates to Search Hotel Page
   
Examples:
        |username|password|
        |AAA|111|
        |BBB|222|
        |sridhara|adhimary|   
   
@RegressionTest   
Scenario: Verify the user is able to search hotels

    When User selects one of "Sydney" as "value" in dropdown
    And  User selects one of the hotel in dropdown
    And User selects the type of room in dropdown
    And User selects number of rooms in dropdown
    And User selects number of adults in dropdown
    And User selects number of children in dropdown
    And User clicks on search button
    Then User verifies whether SearchHotel page navigates to Select Hotel Page

@SanityTest    
Scenario: Verify the user is able to select hotel

    When User selects hotel checkbox
    And User clicks on continue button
    Then User verifies whether Select Hotel Page navigates to Book A Hotel Page
    
Scenario: Verify the user is able to book a hotel

    When User enters first name in firstname field
    And  User enters last name in lastname field
    And User enters billing address in billing address field
    And User enters credit cardnumber in field
    And User enters credit card type in field
    And User enters expiry month in dropdown
    And User enters expiry year in dropdown
    And User enters cvv number in field
    And User clicks on booknow button
    Then User verifies whether Book A Hotel Page to  Bookltinerary page
    
Scenario: Verify the user is able to bookltinerary

    When User clicks on myltinerary button
    Then User verifies whether Bookltinerary page to Bookeditinerary page 
 
     
 
     
    
   
