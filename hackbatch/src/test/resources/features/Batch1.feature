@TC003
Feature: Verify that the title of the Home page is LMS  
 Background: Validating the url
  Given User is on the browser 
    When User opens the LMS Website URL "https://lms-frontend-phase2.herokuapp.com/login"
    Then User should see the Login page.
    When User clicks the Login button after entering valid username as "LMS" and password as "LMS"
    Then user clicks the login button 
    Then User should see the LMS Home page
  Scenario: Validate the heading
  Given User is on the LMS Home program page
  When User clicks Batch button on top
  Then User should see a heading with text Manage Batch on the page
  Scenario: Validating the default state of Delete button 
    Given User is on the LMS Home Program pages
  When User is on Batch page1
    Then Verify that the Delete button next to the search box is Disabled
   Scenario: Validate that number of records (rows of data in the table) displayed 
    Given User is on the LMS Homes page
    When User is on Batch pages
    Then Verify that "number of records" rows of data in the table displayed on the page are five
    Scenario: Search by Batch Name
    Given User is on Batch pagess
    When user clicks on search box with "Batch Name" entered in it
    Then records of that  "Batch Name" are displayed
    #editfeature
   Scenario: Edit Feature
    Given User is on Batch page
    When User clicks on Edit button
   Then User lands on Batch Details form.
   Scenario: Edit Batch Name
    Given User is on Batch details page
    When User "edits Name"
    Then User can see edited Name
   Scenario: Edit  Batch Description
    Given User ison Batch details page
    When user edit "edits description"
    Then User can see edited descricption
    Scenario: Edit program name
    Given User is onn Batch details page
    When user prog "edits program name"
    Then user can see edited program name
    Scenario: change status
   Given User is on Batch detailS page
    When user changes status
    Then User can see updated Status
   Scenario: Edit No of classes
    Given User is on BatcH details page
   When user edits "No of classes"
    Then user can see updated No of classes
    Scenario: Click Cancel1
    Given User is on Batch dEtails page
    When user clicks cancel button
   Then User can see Batch Details are not updated
    
    