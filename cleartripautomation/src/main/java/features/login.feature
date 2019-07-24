@Test
Feature: Cleartrip login validations
    Scenario: Cleartrip login test Scenario

    Given User is already on cleartip page
    When Title of the login page in cleartrip
    Then User click on your Trips icon and Sign In button
    Then User clicks Sign In button in pop up
    Then Error message is displayed
    Then close the Browser