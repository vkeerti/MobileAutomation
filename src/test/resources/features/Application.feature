Feature: Login the QT application
Background:

  Given Open the Chrome and launch the application
  When User login the application

@sanity
Scenario: Login application and validate the accessibility
  Then verify user able to redirect the Home page

  @sanity
  Scenario: Access the top menu and validate pages are loading correctly
  Then  verify all the options are available on Home Page Dashboard
