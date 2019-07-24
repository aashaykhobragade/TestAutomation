@Test
Feature: Cleartrip flightbooking validations
    Scenario: Cleartrip flightbooking test Scenario
    
    Given User is already on cleartip page
    Then User selects one way 
    Then User selects "From" and "To"
    Then User selects Depart on
    Then user selects number of Adults
    And User clicks on Search flights
    Then Close the browser