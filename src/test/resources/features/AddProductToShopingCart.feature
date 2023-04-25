Feature: Hepsiburada Technical Assessment

  @ui
  Scenario Outline: Add product to shopping cart with multiple logging options

    Given user on the homepage
    When user goes to login page
    And user logs in with "<account type>" account
    Then verify user logged in
    And user searches "cep telefonu"
    Then user filters the product price between "3000" to "5000" and "direct"
    And user selects the product randomly at the last row
    And user switches the product page
    Then user selects the seller that has min seller point
    And user adds the product to shopping cart
    And user goes to shopping cart
    Then verify user on the shoppingCart
    Then verify product added on shopping cart

    Examples:

      | account type |
      | google       |
      | hepsiburada  |


  @ui
  Scenario Outline: Add product to shopping cart with multiple filter options

    Given user on the homepage
    When user goes to login page
    And user logs in with "google" account
    Then verify user logged in
    And user searches "cep telefonu"
    Then user filters the product price between "3000" to "5000" and "<runType>"
    And user selects the product randomly at the last row
    And user switches the product page
    Then user selects the seller that has min seller point
    And user adds the product to shopping cart
    And user goes to shopping cart
    Then verify user on the shoppingCart
    Then verify product added on shopping cart

    Examples:

      | runType |
      | refresh |
      | direct  |