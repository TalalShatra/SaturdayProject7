Feature: Add New Address Functionality
 Background:
  Given User navigate to website
  When User enter valid "username" and "password"
  Then User should login successfully

 Scenario: Add new Address
  Given Navigate to My Account page
  And  Click on Manage Addresses
  When Add new address with "phone","address","city","state","zipCode","country"
  Then Validate Address created successfully