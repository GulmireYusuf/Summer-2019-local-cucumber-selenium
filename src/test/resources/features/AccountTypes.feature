@accounts @VYT-312
Feature: Login as different user types
  # WARM UP : implement the following scenarios
  # you can reuse previous step defs classes or create a new one
  # use any tag
  Scenario: Driver user
    Given the user logs in as a "driver"
    When the user goes to "Activities" "Calendar Events"
    Then the title should contain "Calendar Events - Activities"

  Scenario: Sales manager user
    Given the user logs in as a "sales manager"
    When the user goes to "Customers" "Accounts"
    Then the title should contain "Accounts - Customers"

  Scenario: Store manager user
    Given the user logs in as a "store manager"
    When the user goes to "Customers" "Accounts"
    Then the title should contain "Accounts - Customers"

  @smoke
    Scenario Outline: Test login with different types
      Given the user logs in as a "<userType>"

    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |


  Scenario Outline: Test login as <userType>
    Given the user logs in as a "<userType>"

    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |

     #Ctrl+Alt+L= Ratlash

  Scenario Outline: Test login as <usertype>
    Given the user logs in as a "<usertype>"
    When the user goes to "<tab>" "<module>"
    Then the title should contain "<title>"

    Examples: drivers
      | usertype | tab        | module          | title                                                        |
      | driver   | Fleet      | Vehicles        | Car - Entities - System - Car - Entities - System            |
      | driver   | Customers  | Contacts        | Contacts - Customers                                         |
      | driver   | Activities | Calendar Events | Calendar Events - Activities                                 |
      | driver   | System     | Jobs            | Jobs - System                                                |

    Examples: sales managers
      | usertype      | tab        | module          | title                                                              |
      | sales manager | Fleet      | Vehicles        | Car - Entities - System - Car - Entities - System                  |
      | sales manager | Fleet      | Vehicles Model  | All - Vehicles Model                                               |
      | sales manager | Customers  | Accounts        | All - Accounts - Customers                                         |
      | sales manager | Customers  | Contacts        | All - Contacts - Customers                                         |
      | sales manager | Activities | Calendar Events | All - Calendar Events - Activities                                 |
      | sales manager | System     | Jobs            | All - Jobs - System                                            |

    Examples: store managers
      | usertype      | tab        | module          | title                                                              |
      | store manager | Fleet      | Vehicles        | All - Car - Entities - System - Car - Entities - System            |
      | store manager | Fleet      | Vehicles Model  | All - Vehicles Model                                               |
      | store manager | Customers  | Accounts        | All - Accounts - Customers                                         |
      | store manager | Customers  | Contacts        | All - Contacts - Customers                                         |
      | store manager | Activities | Calendar Events | All - Calendar Events - Activities                                 |
      | store manager | System     | Jobs            | All - Jobs - System|



