Feature: Agoda.com


  @Smoke
  Scenario Outline: Agoda.com searching
    Given User go to  HomePage
    When Click search Hotel
    When Search Location for vacation
    When Choose start - end date
    When Close info pop-up
    When Add child option
    When Choose child's age
    Then Click search button
    And Check the page is open as filtered
    When Click distance options and chose nearest to the central
    When Scroll until find Accomadation Filter and Chose Hotel
    When Scroll until find Star Rating Filter Chose Hotel Star Rate
    When Scroll until find Property facilities and Chose
    When Scroll until find distance and Chose
    When Click Hotel price
    Then Go to previous page
    When Click room tab
    When Click book now
    Then Enter name & surname, email
    When Click next step
    And Check the cart page
    Examples:



















    

