Feature: Sign Document

  Background:
    Given user open "paradize" site

  Scenario: Fungsi sign document cek fisik oleh semua approver
    When user login as "approver assetholder"
    And access cek fisik
    And choose list with status submitted
    Then sign the document
    And logout

    When user login as "approver keuangan"
    And access cek fisik
    And choose list with status submitted
    Then sign the document
    And logout

    When user login as "approver hssesf"
    And access cek fisik
    And choose list with status submitted
    Then sign the document
    And logout

    When user login as "approver ahli"
    And access cek fisik
    And choose list with status submitted
    Then sign the document
    And logout

    When user login as "approver hssesc"
    And access cek fisik
    And choose list with status submitted
    Then sign the document
    And logout

    When user login as "approver asset holder owner"
    And access cek fisik
    And choose list with status submitted
    Then sign the document
