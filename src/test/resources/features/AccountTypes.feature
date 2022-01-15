
Feature: Login as different user types

  # WARM UP : implement the following scenarios
  # you can reuse previous step defs classes or create a new one
  # use any tag


  Scenario: Driver user
    Given the user logs in as a "driver"
    When the user goes to "Activities" "Calendar Events"
    Then the tile should contain "Calendar Events - Activities"
  @differentUser
  Scenario: Sales manager user
    Given the user logs in as a "sales manager"
    When the user goes to "Customers" "Accounts"
    Then the tile should contain "Accounts - Customers"

  Scenario: Store manager user
    Given the user logs in as a "store manager"
    When the user goes to "Customers" "Accounts"
    Then the tile should contain "Accounts - Customers"
