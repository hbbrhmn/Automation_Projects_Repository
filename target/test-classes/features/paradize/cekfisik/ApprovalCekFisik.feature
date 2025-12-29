Feature: Approval Request

  Background:
    Given user open "paradize" site
    When user login as "coordinator"

  Scenario: Coordinator approve request cek fisik
    When access cek fisik
    Then choose list with status request
    Then click approve
    And fill column remark
    Then approve request