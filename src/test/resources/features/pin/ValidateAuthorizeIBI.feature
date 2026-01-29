Feature: Upload Document IBI

  Background:
    Given user open "pin" site
    When user login as "user2222"

  Scenario: Authorize Edit Document Base On Company
    When access menu international business intelligence
    Then check visibility button edit on document "Authorize Edit Delete"
