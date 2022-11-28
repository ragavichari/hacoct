Feature: Verify that the title of the Home page is LMS  
 Background: Validating the url
  Given User is on the browser 
    When User opens the LMS Website URL "https://lms-frontend-phase2.herokuapp.com/login"
    Then User should see the Login page.
    When User clicks the Login button after entering valid username as "LMS" and password as "LMS"
    Then user clicks the login button 
    Then User should see the LMS Home page
    #Pagination feature
    Scenario: Verify previous link on the first page
    Given User is logged on to LMS website
    When User is on first page of Manage Batch 
    Then Verify that previous link is disabled
   Scenario: Verify next link
    Given User is on the page number '1' 
    When User clicks navigate > buttons
    Then User navigated to page number '2'
    Scenario: Verify previous link
    Given User is on page number '2'
    When User clicks navigate < buttonss
    Then User navigated to page number '1'
    Scenario: Verify next link on the last page
    Given User is logged on to LM website
    When User is on last page of Manage Batch
    Then Verify that next link is disabled
    #Results in Ascending order feature
    Scenario: Verify that the results are displayed in Ascending order of Batch name
    Given User is on Batch pageoo
    When User clicks on the Ascending arrow (down ) near to the Batch name 
    Then User can see the results in Ascending order of Batch name
    Scenario: Verify that the results are displayed in Ascending order of batch Description
    Given User is on Batch pagett
    When User clicks on the Ascending arrow (down ) near to the Batch Description 
    Then User can see the results in Ascending order of Batch Description
    Scenario: Verify that the results are displayed in Ascending order of Batch Status
    Given User is on Batch pageff
    When User clicks on the Ascending arrow (down ) near to the Batch Status 
    Then User can see the results in Ascending order of Batch Status
    Scenario: Verify that the results are displayed in Ascending order No of Classes
    Given User is on Batch pagezz
    When User clicks on the Ascending arrow (down ) near to the No Of Classes
    Then User can see the results in Ascending order of No of Classes
    Scenario: Verify that the results are displayed in Ascending order of Program Name
    Given User is on Batch pageqq
    When User clicks on the Ascending arrow (down ) near to the Program Name
    Then User can see the results in Ascending order of Program Name
    