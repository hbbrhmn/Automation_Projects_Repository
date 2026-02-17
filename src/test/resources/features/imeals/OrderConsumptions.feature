Feature: Order Consumption

  Background:
    Given user open "imeals" site
    When user login as "requestororganic"

  Scenario: User organic create order consumption
    When access menu new request
    Then user fill column contact number
    And user click button next
    Then user fill column nama kegiatan
    Then user fill column jumlah hari
    Then user fill column jumlah peserta
    Then user choose tanggal
    Then user choose jam awal
    Then user choose jam akhir
    Then user choose jenis kegiatan
    Then user choose peserta kegiatan
    Then user choose level jabatan
    Then user choose gedung
    Then user choose lantai
    Then user choose ruangan
    And user click button next
    And user skip upload attachment
    Then user click button add jenis konsumsi
    Then user choose jenis konsumsi
    Then user fill column pengantaran
    And user click button submit jenis
    And user click button add menu
    Then user choose menu
    Then user fill column jumlah menu
    And user click button submit menu
    Then user click button submit request
    Then approver name should be "Sambara Hanenda Adiwilaga"
    And user choose yes
    Then pop up success box text should be "Data berhasil disubmit!"
#   And user click tombol ok