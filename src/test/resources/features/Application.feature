Feature: Login the application
Background:

  Given Open the Chrome and launch the application
  When User login the application

@sanity
Scenario: Login application and validate the accessibility
  Then verify user able to get the page title
