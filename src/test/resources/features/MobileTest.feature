Feature: RQ mobile automation

  @mobile
  Scenario: RQ mobile automation
    Given Launch RQ mobile app
    When SignIn validation
    When Validate safe message
    When Click on sync
    When Select the jobs and click Open
    When Accept Instructions
    When Validate Home
    Then Close the app