Feature: Testen der Faktor Klasse

  Scenario: Erstellen eines Faktors
    Given a faktor with id 1, idKat 2 and faktor 1.5
    When I create the faktor
    Then the faktor's id should be 1
    And the faktor's idKat should be 2
    And the faktor's faktor should be 1.5

  Scenario Outline: Überprüfen der Faktor Werte
    Given I have a faktor with id <id>, idKat <idKat>, and faktor <faktor>
    When I verify the values
    Then the faktor's id should be <id>
    And the faktor's idKat should be <idKat>
    And the faktor's faktor should be <faktor>

    Examples:
      | id | idKat | faktor |
      | 1  | 2     | 1.5    |
      | 3  | 4     | 2.0    |
      | 5  | 6     | 2.5    |
      