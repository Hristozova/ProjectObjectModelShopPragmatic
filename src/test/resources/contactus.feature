Feature: Customer wants to contact the admins
  As a customer,
  I want to contact with you
  so that I can ask some question

  @vladimira
  Scenario: Valid sent message
    Given the user is on the shoppragmatic home page
    When the user searches and clicks on Contact us field
    And the user writes his name "Vladi"
    And the user writes his email "vladi@mail.bg"
    And the user writes his enquiry "Do you have showroom in Sofia?"
    And the user clicks Submit button
    Then ensure that the user sees the message "Your enquiry has been successfully sent to the store owner!"

  @vladimira
  Scenario: YourName field is empty
    Given the user is on the shoppragmatic home page
    When the user searches and clicks on Contact us field
    And the user does not write his name
    And the user writes his email "vladi@mail.bg"
    And the user writes his enquiry "Do you have showroom in Sofia?"
    And the user clicks Submit button
    Then ensure that message "Name must be between 3 and 32 characters!" is displayed

  @vladimira
  Scenario:  E-Mail field is empty
    Given the user is on the shoppragmatic home page
    When the user searches and clicks on Contact us field
    And the user writes his name "Vladi"
    And the user does not write his email
    And the user writes his enquiry "Do you have showroom in Sofia?"
    And the user clicks Submit button
    Then ensure that email message "E-Mail Address does not appear to be valid!" is displayed



  @vladimira
  Scenario: Enquiry field is empty
    Given the user is on the shoppragmatic home page
    When the user searches and clicks on Contact us field
    And the user writes his name "Vladi"
    And the user writes his email "vladi@mail.bg"
    And the user does not write his enquiry
    And the user clicks Submit button
    Then ensure that enquiry message "Enquiry must be between 10 and 3000 characters!" is displayed
