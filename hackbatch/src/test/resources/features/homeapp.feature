@TC002

Feature: Verify that the title of the Home page is LMS  
 Background: Validating the url
  Given User is on the browser 
    When User opens the LMS Website URL "https://lms-frontend-phase2.herokuapp.com/login"
    Then User should see the Login page.
    When User clicks the Login button after entering valid username as "LMS" and password as "LMS"
    Then user clicks the login button 
    Then User should see the LMS Home page
  Scenario: Verify that the title of the Home page is "LMS"
  Given User is on the LMS Home page
  When User should see the LMS page
  Then Verify the title of the Home page
  Then User should see a heading with text LMS - Learning Management System on the Home page
  Then User should see a button with text Program on the menu bar
  Then User should see a button with text Batch on the menu bar
  Then User should see a button with text User on the menu bar
  Then User should see a button with text Assignment on the menu bar
  Then User should see a button with text Attendance on the menu bar
  Then User should see a button with text Logout on the menu bar
  