Feature: Upload Document IBI

  Background:
    Given user open "pin" site
    When user login as "user1010"

  Scenario: User upload document
    When access menu international business intelligence
    Then user click button upload document
    Then user fill column
    Then user choose authors
    Then user choose countries
    Then user choose stream
    Then user choose type of study
    Then user choose date research
    Then user choose entity
    Then user choose confidentiality
    Then user upload doc
    And submit document

