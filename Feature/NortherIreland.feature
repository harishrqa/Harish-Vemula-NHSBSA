@SmokeTest
Feature: NorthernIreland

  Scenario: NorthernIreland
    Given User opens nhs cost checker tool
    Then Page title should be "Check what help you could get to pay for NHS costs - NHSBSA"
    When Click on Start now
    And User Select Country "Northern Ireland" and click next
    Then Verify Services not available in Northern Ireland
