Feature: Purchase Functionality
  Background:
    Given User navigate to website
    When User enter valid "username" and "password"
    Then User should login successfully

  Scenario: purchase any Product
    Given Select any Product
    When Complete checkout process
    Then Validate successfully purchased Product