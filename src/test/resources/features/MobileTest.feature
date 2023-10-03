Feature: Revoquest Mobile automation

  @mobile
  Scenario: Revoquest Mobile automation
    Given Launch Revoquest mobile app
    When SignIn to Revoquest app
    When Validate Safe message
    When Click on Sync
    Then Close the app