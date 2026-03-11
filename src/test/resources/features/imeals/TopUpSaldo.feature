Feature: Top Up Saldo

  Background:
    Given user open "imeals" site
    When user login as "requestororganic"

  Scenario: User organic create request top up saldo
    When user click button top up saldo
    Then user choose kategori
    Then user upload attachment
    Then user click button submit top up
    And user choose yes top up