@SmokeTest
Feature: A user from England verifies what help they can get tp pay for NHS costs

  Background: Navigate to cost checker tool
    Given User opens nhs cost checker tool


  Scenario Outline: User living in England with no benefits
    Then Page title should be "Check what help you could get to pay for NHS costs - NHSBSA"
    When Click on Start now
    And User Select Country "England" and click next
    And User Select GP Scotland or wales "No" and click next
    And User Select Dental Practice Country "Not Registered" and click next
    And User enters DOB "<dob>" and click next
    And User Select live with partner "No" and click next
    And User Select claim any benefits or tax credits "No" and click next
    And User Select pregnant or have you given birth in the last 12 months "No" and click next
    And User Select injury or illness caused by serving in the armed forces "No" and click next
    And User Select have diabetes "No" and click next
    And User Select list of medical conditions "No" and click next
    And User Select you or a family member have glaucoma "No" and click next
    And User Select live permanently in a care home "No" and click next
    And User Select more than in savings, investments or property "No" and click next
    Then Verify the final result without benefits
    And Verify Healthy Start Link displayed

    Examples:
    |dob|
    |20-12-1980|

  Scenario Outline: User is below 16 years living in England
    Then Page title should be "Check what help you could get to pay for NHS costs - NHSBSA"
    When Click on Start now
    And User Select Country "England" and click next
    And User Select GP Scotland or wales "No" and click next
    And User Select Dental Practice Country "Not Registered" and click next
    And User enters DOB "<dob>" and click next
    Then Verify the final result for minor in England
    Examples:
      |dob|
      |01-02-2008|


  Scenario: England with benefits
    Then Page title should be "Check what help you could get to pay for NHS costs - NHSBSA"
    When Click on Start now
    Then Verify Which country do you live in page displayed
    When User Select Country "England" and click next
    And User Select GP Scotland or wales "No" and click next
    And User Select Dental Practice Country "Not Registered" and click next
    And User enters DOB "23-12-1980" and click next
    And User Select live with partner "No" and click next
    And User Select claim any benefits or tax credits "Yes" and click next
    And User Select get paid Universal Credit "Yes" and click next
    And User Select Universal Credit "Yes" and click next
    And User Select take home pay "Yes" and click next
    Then Verify the final result with benefits

  Scenario: England with Armed Forces
    Then Page title should be "Check what help you could get to pay for NHS costs - NHSBSA"
    When Click on Start now
    And User Select Country "England" and click next
    And User Select GP Scotland or wales "No" and click next
    And User Select Dental Practice Country "Not Registered" and click next
    And User enters DOB "23-12-1980" and click next
    And User Select live with partner "No" and click next
    And User Select claim any benefits or tax credits "No" and click next
    And User Select pregnant or have you given birth in the last 12 months "No" and click next
    And User Select injury or illness caused by serving in the armed forces "Yes" and click next
    And User Select have diabetes "No" and click next
    And User Select list of medical conditions "No" and click next
    And User Select you or a family member have glaucoma "No" and click next
    And User Select live permanently in a care home "No" and click next
    And User Select more than in savings, investments or property "No" and click next
    Then Verify the final result with armed forces

  Scenario: England in Care Home
    Then Page title should be "Check what help you could get to pay for NHS costs - NHSBSA"
    When Click on Start now
    Then Verify Which country do you live in page displayed
    And User Select Country "England" and click next
    And User Select GP Scotland or wales "No" and click next
    And User Select Dental Practice Country "Not Registered" and click next
    And User enters DOB "23-12-1980" and click next
    And User Select live with partner "No" and click next
    And User Select claim any benefits or tax credits "No" and click next
    And User Select pregnant or have you given birth in the last 12 months "No" and click next
    And User Select injury or illness caused by serving in the armed forces "No" and click next
    And User Select have diabetes "No" and click next
    And User Select list of medical conditions "No" and click next
    And User Select you or a family member have glaucoma "No" and click next
    And User Select live permanently in a care home "Yes" and click next
    And User Select pay for your care home from your local council "Yes" and click next
    Then Verify the final result with care home
