Feature: Testen der Meisterschaften Klasse

  Scenario: Erstellen einer Meisterschaft
    Given a meisterschaft with id 1, name "Schweizermeisterschaft" and abk "SM"
    When I create the meisterschaft
    Then the meisterschaft's id should be 1
    And the meisterschaft's name should be "Schweizermeisterschaft"
    And the meisterschaft's abk should be "SM"

 # Scenario Outline: Überprüfen der Meisterschaften Werte
 #   Given I have a meisterschaft with id <id>
 #   When I verify the meistervalues
 #   Then the meisterschaft's name should be <name>
 #   And the meisterschaft's abk should be <abk>
#
 #   Examples:
 #     | id | name                    | abk |
 #     | 1  | Schweizermeisterschaft  | SM  |
 #     | 2  | Weltmeisterschaft       | WM  |
 #     | 3  | Europameisterschaft     | EM  |
 #     | 4  | Olymische Spiele        | OS  |
      