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
Feature: Punktetabelle prüfen


  @tag1
  Scenario: create a new Punktetabelle
    Given a punktetabelle with id 1, idRennart 11 and rang 55 and punkte 99
    When I create the punktetabelle
    Then the punktetabelle's id should be 1
    And the punktetabelle's rang should be 55
    And the punktetabelle's idRennart should be 11
    And the punktetabelle's punkte should be 99

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I have a rang <rang> and a idRennart <idRennart>
    When I check the value for <punkte> punkte
    Then the punkte should be korrekt

# idRennart = 1; international, idRennart = 2; national, idRennart = 3; regional
    Examples: 
      | id  | idRennart | rang  | punkte |
      | 	1 |     1 		|   1  	|    30  |
      | 	2	|     1			|  	2	  |    25  |
      | 	3	|     1			|   3		|    20  |
      | 	4	|     1			|   4 	|    15  |
      | 	5	|     1 		|   5		|    12  |
      | 	6	|     1			|   6 	|    10  |
      | 	7	|     1 		|   7 	|     8  |
      | 	8	|     1			|   8 	|     7  |
      | 	9	|     1 		|   9		|     6  |
      |  10	|     2 		|   1 	|    20  |
      |  11 |     2     |   2   |    15  |
      |  12 |     2     |   3   |    12  |
      |  13 |     2     |   4   |    10  |
      |  14 |     2     |   5   |     8  |
      |  15 |     2     |   6   |     7  |
      |  16 |     2     |   7   |     6  |
      |  17 |     3     |   1   |    15  |
      |  18 |     3     |   2   |    12  |
      |  19 |     3     |   3   |    10  |
      |  20 |     3     |   4   |     8  |
      |  21 |     3     |   5   |     7  |
      |  22 |     3     |   6   |     6  |
     