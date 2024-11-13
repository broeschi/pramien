Feature: Testen der KilometerGeld Klasse

  Scenario: Erstellen eines KilometerGeld
    Given a kilometergeld with id 1, anzahlFahrer 2 and frankenProKm 1.5
    When I create the kilometergeld
    Then the kilometergeld's id should be 1
    And the kilometergeld's anzahlFahrer should be 2
    And the kilometergeld's frankenProKm should be 1.5

  Scenario Outline: Überprüfen der KilometerGeld Werte
    Given I have a kilometergeld with id <id>, anzahlFahrer <anzahlFahrer>, and frankenProKm <frankenProKm>
    When I verify the kmgvalues
    Then the kilometergeld's id should be <id>
    And the kilometergeld's anzahlFahrer should be <anzahlFahrer>
    And the kilometergeld's frankenProKm should be <frankenProKm>

    Examples:
      | id | anzahlFahrer | frankenProKm |
      | 1  | 2            | 1.5          |
      | 3  | 4            | 2.0          |
      | 5  | 6            | 2.5          |
