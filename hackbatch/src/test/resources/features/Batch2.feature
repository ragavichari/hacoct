Feature: Verify that the title of the Home page is LMS  
 Background: Validating the url
  Given User is on the browser 
    When User opens the LMS Website URL "https://lms-frontend-phase2.herokuapp.com/login"
    Then User should see the Login page.
    When User clicks the Login button after entering valid username as "LMS" and password as "LMS"
    Then user clicks the login button 
    Then User should see the LMS Home page
   Scenario: click save
    Given User is on Batch details pAge
    When user clicks save buttona
    Then User can see Successful Batch Updated alert
    #errorbatchname
    Scenario: Verify Edited BatcH details
    Given User is on Batch  page2
    When User searches with newly updated "Batch Name"
    Then User verifies that the details are correctly updated.
     Scenario: Select Batch
    Given UseR is on Batch page
   When User selects more than one Batch using checkbox
    Then Baches gets selected
    # Delete  multiple batches
    #error
    Scenario: Delete  multiple batches 
   Given  User is on Batch paGe
    When User clicks on Delete button
    Then User lands on Confirm Deletion form.
    Scenario: Click Yes
    Given  UsER is on Batch page
    When User clicks Yes button
    Then User can see 'Successful BatchDeleted' message
    Scenario: Verify deleted batches
    Given  USer is on Batch page
    When User Searches for "Deleted Batch names"
    Then There should be zero results.
    Scenario: click no
    Given  UsEr is oN Batch page
    When User clicks No button
    Then User can see Batches are still selected and not deleted
    Scenario: delete feature
   Given user is on Batch page3
    When user clicks delete  button for any batch
    Then user will get confirm deletion popup
    #error
    Scenario: Click Yes
    Given user is  ON THEBatch pagea
    When User clicks Yes buttoN
    Then User can see 'Successful BatchDeleted' messagE
    Scenario: Verify deleted batch
    Given user is on Batch pagec
    When User Searches foR "Deleted Batch name"
    Then There should be Xero results.
    