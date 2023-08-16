#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Verify Login Functionality
  I want to use this template for my feature file

  @tag1
  Scenario: check login functionality with valid credential
    Given Agent open the browser and setup the chromeDriver
    And Agent on login page of engage application and maximize the window
    When Agent enter the username in username field
    And Agent enter the password in password field
    And Agent click on login button
    Then Agent should able to login successfully
