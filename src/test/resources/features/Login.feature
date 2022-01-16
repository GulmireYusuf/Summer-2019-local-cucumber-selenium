@login @smoke
Feature:  Users should be able to login

  Background:
    Given the user is on the login page

  @driver @VYT-123
  Scenario: Login as a driver
    When the user enters the driver login information
    Then the user should be able to login

    @sales_manager  @VYT-123
  Scenario: Login as a sales manager
    When the user enters the sales manager login information
    Then the user should be able to login

  @store_manager
  Scenario: Login as a store manager
    When the user enters the store manager login information
    Then the user should be able to login


  @store_manager
  Scenario: Login and fail
    When the user enters the store manager login information
    Then the user should be able to login


 #this is the another style use scenario outline for this 3 users
  @wip
    Scenario Outline: Login multiple users
      When the user enters the <user> login information
      Then the user should be able to login
      Examples:
        | user          |
        |driver         |
        | sales manager |
        | store manager |



