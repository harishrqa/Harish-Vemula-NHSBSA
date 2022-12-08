@SmokeTest
Feature: Wales

  Scenario: Wales with no benefits
    Given User opens nhs cost checker tool
    Then Page title should be "Check what help you could get to pay for NHS costs - NHSBSA"
    When Click on Start now
    And User Select Country "Wales" and click next
    And User Select GP Scotland or wales "No" and click next
    And User Select Dental Practice Country "Not Registered" and click next
    And User enters DOB "23-12-1980" and click next
    And User Select live with partner "No" and click next
    And User Select claim any benefits or tax credits "No" and click next
    And User Select pregnant or have you given birth in the last 12 months "No" and click next
    And User Select injury or illness caused by serving in the armed forces "No" and click next
    And User Select have diabetes "No" and click next
    And User Select you or a family member have glaucoma "No" and click next
    And User Select live permanently in a care home "No" and click next
    And User Select more than in savings, investments or property "No" and click next
    Then Verify the final result without benefits for scotland