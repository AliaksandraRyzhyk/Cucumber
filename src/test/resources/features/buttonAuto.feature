# language: en
@Scenario1
Feature: Valid structure in the submenu of the HousesAndFlats button

  Scenario: Check that the visible submenu of the Auto button has a specific structure
    Then Hover over the Auto button
    Then Check frame the Auto button is visible
    And Submenu the Auto button has a specific structure

