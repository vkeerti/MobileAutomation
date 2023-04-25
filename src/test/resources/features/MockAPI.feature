Feature: Mock API testing

  @api
  Scenario: Mock Api testing with POST and GET methods

    When user sends the POST request for getting access token
    And user sends the POST request for creating new barcode
    Then user sends GET request for getting the invoice link