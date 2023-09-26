Feature: Place Order Functionality of SwagLabs App

  As a user of SwagLabs Website
  I want to order from the website
  and it should place successfully

  Scenario: Successful place order
    Given I am logged in to Swag Labs
    When I have added item to cart and checkout
    And I have added user information and clicked continue
    Then My Order placed successfully