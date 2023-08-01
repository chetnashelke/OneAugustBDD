Feature: Test the Orange Hrm Application

  Scenario: Test Login functionality
    Given User open a url
    When User enter valid username and valid password
    Then User on home page and verify homepage title
