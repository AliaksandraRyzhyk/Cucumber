# language: en

Feature: Valid structure in the submenu of the HousesAndFlats button

  Scenario: Check that the visible submenu of the HousesAndFlats button has a specific structure
    Then Hover over the HousesAndFlats button
    Then Check submenu the HousesAndFlats button is visible
    And Submenu the HousesAndFlats button has a specific structure

