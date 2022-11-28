Feature: Verify that the title of the Home page is LMS  
 Background: Validating the url
  Given User is on the browser 
    When User opens the LMS Website URL "https://lms-frontend-phase2.herokuapp.com/login"
    Then User should see the Login page.
    When User clicks the Login button after entering valid username as "LMS" and password as "LMS"
    Then user clicks the login button 
    Then User should see the LMS Home page
    #Results in Descending order feature
  Scenario: Verify that the results are displayed in Descending order of Batch name
   Given User is on Batch pagexx
   When User clicks onthe Descending arrow (down ) near to the Batch name
   Then User can see the results in Descending order of Batch name
   Scenario: Verify that the results are displayed in Descending order of Batch Description
   Given User is on Batch pageiil
   When User clicks onthe Descending arrow (down ) near to the Batch Description
   Then User can see the results in Descending order of Batch Description
   Scenario: Verify that the results are displayed in Descending order of Batch Status
   Given User is on Batch pagery
   When User clicks onthe Descending arrow (down ) near to the Batch Status
   Then User can see the results in Descending order of Batch Status
   Scenario: Verify that the results are displayed in Descending order No of Classes
   Given User is on Batch paged
   When User clicks on the Descending arrow (down ) near to the No Of Classes
   Then User can see the results in Descending order of No of Classes
   Scenario: Verify that the results are displayed in Descending order of Program Name
   Given User is on Batch pageaa
   When User clicks on the Descending arrow (down ) near to the Program Name
   Then User can see the results in Descending order of Program Name

    