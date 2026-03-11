Feature: Approval Request

  Background:
    Given user open "imeals" site
    When user login as "approverbpdhc"

  Scenario: User approve request consumption
    When access menu my approval
    And access submenu request
    Then user choose request consumption number "RK000000001"
    Then user click button approve
    Then user choose yes

  Scenario: User revise request consumption
    When access menu my approval
    And access submenu request
    Then user choose request consumption number "RK000000002"
    Then user click button revise
    Then user fill column message revise
    Then user click revise

  Scenario: User reject request consumption