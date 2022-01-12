@navigateTest
Feature: Navigation menu

  @nav_menu
  Scenario: Fleet---->Vehicles
    Given the user is on the login page
    And the user enters the sales manager login information
    When the user goes to Fleet,Vehicles
    Then the url should be https://app.vytrack.com/entity/Extend_Entity_Carreservation

  @nav_menu
  Scenario: Marketing-->Campaigns
    Given the user is on the login page
    And the user enters the sales manager login information
    When the user goes to Marketing,Campaigns
    Then the url should be https://app.vytrack.com/campaign/

  @nav_menu
  Scenario: Activities-->Calender Events
    Given the user is on the login page
    And the user enters the sales manager login information
    When the user goes to Activities,Calender Events
    Then the url should be https://app.vytrack.com/calendar/event

