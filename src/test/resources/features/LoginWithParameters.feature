
Feature:Users should be able to login


  Scenario: Login as a driver user
    Given the user is on the login page
    When user logs in using "user1" and "UserUser123"
    Then the user should be able to login
    And the title should contain "Dashboard"


    Scenario:  Login as a sales manager user
      Given the user is on the login page
      When user logs in using "salesmanager101" and "UserUser123"
      Then the user should be able to login
      And the title should contain "Dashboard"


  Scenario:  Login as a store manager user
    Given the user is on the login page
    When user logs in using "storemanager51" and "UserUser123"
    Then the user should be able to login
    And the title should contain "Dashboard"




