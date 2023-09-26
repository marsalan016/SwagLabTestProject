Feature: Login Functionality of SwagLabs App

  As a user of SwagLabs Website
  I want to login the website
  and want to access features of the websites

  Background:
    Given I am on the Swag Labs login page

  Scenario: Successful login with valid credentials
    Given I have entered a valid username and password
    When I clicked on Login Button
    Then I logged in successfully to the Swag Labs

  Scenario Outline: Unsuccessful login with invalid or empty credentials
    Given I have entered invalid "<username>" and "<password>"
    When I clicked on Login Button
    Then It showed me "<errormessage>"

    Examples:
      | username      | password         | errormessage                                                              |
      | invalidUser1  | secret_sauce     | Epic sadface: Username and password do not match any user in this service |
      | standard_user | invalidPassword1 | Epic sadface: Username and password do not match any user in this service |
      | invalidUser2  | invalidPassword2 | Epic sadface: Username and password do not match any user in this service |





