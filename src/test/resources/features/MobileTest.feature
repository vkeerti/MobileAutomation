Feature: RQ mobile automation

  @mobile
  Scenario: RQ mobile automation
    Given Launch RQ Mobile App
    When Validate SignIn
    When Validate Safe Message
    When Validate sync process
    When Select the jobs and click Open
    When Validate Instructions
    When Validate Home
    When Validate Location
    When Validate Setting
    When Validate Auditing
    When Validate Footer
    When Validate Finalize
    Then Close the app