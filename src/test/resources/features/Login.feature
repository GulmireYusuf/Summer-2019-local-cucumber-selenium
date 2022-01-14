@login @smoke
Feature:  Users should be able to login

  @driver @VYT-123
  Scenario: Login as a driver
    Given the user is on the login page
    When the users enters the driver login information
    Then the user should be able to login

    @sales_manager  @VYT-123
  Scenario: Login as a sales manager
    Given the user is on the login page
    When the user enters the sales manager login information
    Then the user should be able to login

  @store_manager
  Scenario: Login as a store manager
    Given the user is on the login page
    When the user enters the store manager login information
    Then the user should be able to login


