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
Feature: Adresse verwalten

  Scenario: Create a new Adresse
    Given a adresse with adrid 1, idPerson 1 and strasse "Zielgasse" and nummer 99 and plz 1234 and ort "Altenrhein"
    When I create the adresse
    Then the adresse's adrid should be 1
    And the adresse's idPerson should be 1
    And the adresse's strasse should be "Zielgasse"
    And the adresse's nummer should be 99
    And the adresse's plz should be 1234
    And the adresse's ort should be "Altenrhein"
