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
Feature: Person Management

  Scenario: Create a new Person
    Given a person with id 1, name "Muster" and firstname "Hans" and lizenzno 123456789
    When I create the person
    Then the person's id should be 1
    And the person's name should be "Muster"
    And the person's firstname should be "Hans"
    And the person's lizenzno should be 123456789
