Feature: Sign Document

  Background:
    Given user open "paradize" site

  Scenario: Fungsi sign document cek fisik oleh semua approver
    When user login as "assetholder"
    And access cek fisik
    And choose list with status submitted
    Then sign the document
    And logout

    When user login as "keuangan"
    And access cek fisik
    And choose list with status submitted
    Then sign the document
    And logout

    When user login as "hssesafetyandsecurity"
    And access cek fisik
    And choose list with status submitted
    Then sign the document
    And logout

    When user login as "ahli"
    And access cek fisik
    And choose list with status submitted
    Then sign the document
    And logout

    When user login as "assetholderowner"
    And access cek fisik
    And choose list with status submitted
    Then sign the document
