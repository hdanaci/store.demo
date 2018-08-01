Feature: Login Test 

Scenario: the user login website
    Given the user is on the login page
    When the user enters username and password
    Then verify home page title "GTPL Bank Manager HomePage"