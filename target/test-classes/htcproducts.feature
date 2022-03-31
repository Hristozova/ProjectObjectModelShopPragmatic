Feature: Customer looking for HTC products
  As a customer,
  I want to find HTC products on that site
  so that I can see all HTC products you have

  @vladimira
  Scenario: Valid search of products
    Given the user is on the shoppragmatic home page
    When the user writes "HTC" in Search field
    And the user clicks search button
    Then ensure positive message appears "Showing 1 to 1 of 1 (1 Pages)"


  @vladimira
  Scenario: Invalid search of products
    Given the user is on the shoppragmatic home page
    When the user writes "HTCC" in Search field
    And the user clicks search button
    Then ensure negative message appears "There is no product that matches the search criteria."
