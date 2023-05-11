Feature: Login into application
Background:

  Given Open the Chrome and launch the application
  When User login the application

@sanity @regression
Scenario: Login application and validate the accessibility
  Then verify user able to redirect the Home page

@sanity @regression
  Scenario: Access the top menu and validate pages are loading correctly
    Then  verify all the options are available on Home Page Dashboard

@regression
  Scenario: Checking the Audit Detail
    Then verify Audit Detail tabs and list

@regression
  Scenario: Checking the Lists Detail
    Then verify Lists Details

@regression
  Scenario: Checking the Portfolio Detail
    Then verify Portfolio Details

@regression
  Scenario: Checking the Contact Detail
    Then verify Contact Detail

@regression
  Scenario: Checking the Utilities Detail
    Then verify Utilities Detail