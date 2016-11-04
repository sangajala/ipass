Feature: Landing page features


  Scenario: User can login to landing page

    Given an admin is in login page
    When he logs into admin panel with valid username "vamsi@gmail.com" and password "vamsi"
    Then he should login in successfully

