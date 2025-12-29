Feature: Create Draft

  Background:
    Given user open "paradize" site
    When user login as "conceptor"

  Scenario: Conceptor creates a draft cek fisik
    When access cek fisik
    Then user fill in draft header
    When click next
    Then choose asset number
    And choose klasifikasi asset
    And choose status cek fisik
    And fill keterangan
    And upload document
    Then add asset
    When click next
    Then choose approver
    Then submit request
