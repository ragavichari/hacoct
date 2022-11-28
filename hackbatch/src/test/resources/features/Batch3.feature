Feature: Verify that the title of the Home page is LMS  
 Background: Validating the url
  Given User is on the browser 
    When User opens the LMS Website URL "https://lms-frontend-phase2.herokuapp.com/login"
    Then User should see the Login page.
    When User clicks the Login button after entering valid username as "LMS" and password as "LMS"
    Then user clicks the login button 
    Then User should see the LMS Home page
Scenario: click no
    Given user is on Batch PPage
    When User clicks NO bUtton
    Then User can see Batch is not deleted.
   Scenario: Add Batch
    Given User is on Batch details pagem
    When User clicks A New Batch button
    Then user can see Batch details form
    Scenario: Empty form submission
    Given User is on Batch details pagen
    When User clicks Save button without entering data
    Then User gets message Name is required
    Scenario: Click Cancel
    Given User is on Batch details pagev
    When User clicks Cancel button0
    Then User can see Batch Details form disappears
     Scenario: Enter Batch Name
    Given User is on Batch details pagex
    When user enters "name" in text box
    Then User can see Name entered
    Scenario: Enter Program name
    Given User is on Batch details pagez
    When User selects "Program name"
    Then User can see 'Program Name' selected
    Scenario: Select Status
    Given User is on Batch details pagea
    When User selects Status using radiobutton
   Then User can see 'Active/Inactive' status selected
    Scenario: Enter No of classes
    Given User is on Batch details pageq
    When User enters 'No of classes' in text boxv
    Then User can see 'No of classes' entered
    Scenario: Click Save
    Given User is on Batch details pagee
    When User clicks Save button
    Then User gets message 'Successful batch created'
    Scenario: Verify Added Batch is created
    Given User is on Batch details paget
    When User searches with newly created "Batch Name"
    Then records of the newly created  "Batch Name" is displayed
    