Feature: Customer looking for products with a certain price
  As a customer,
  I want to find products that costs a certain price
  so that I can see my choices.

  @vladimira
  Scenario: Valid Search for products with certain price
    Given the user is on the shoppragmatic admin home page
    When the user enters "admin" username
    And  the user enters "parola123!" password
    And the user clicks on Login button
    And the user clicks on Catalog
    And the user clicks on Products
    And the user writes the wanted price of "100"
    And the user clicks on Filter button
    Then ensure that the value of priceField is "100"

  @vladimira
  Scenario: Wrong username
    Given the user is on the shoppragmatic admin home page
    When the user enters "adm" username
    And  the user enters "parola123!" password
    And the user clicks on Login button
    Then ensure that panel title text is "Please enter your login details."

  @vladimira
  Scenario: Wrong password
    Given the user is on the shoppragmatic admin home page
    When the user enters "admin" username
    And  the user enters "arola123!" password
    And the user clicks on Login button
    Then ensure that panel title text is "Please enter your login details."






