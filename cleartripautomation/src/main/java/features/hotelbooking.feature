@Test
Feature: Cleartrip hotelbooking validations
    Scenario: Cleartrip hotelbooking test Scenario
    
    Given User is already on cleartip page
    Then User clicks on Hotels tab
    Then User enters City in Where feild
    Then User enters Check-in and Check-out details
    Then User clicks Search hotels
    Then Close the browser