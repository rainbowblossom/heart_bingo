Feature: Login Test
  As a user I want to login into HeartBingo website

  Scenario Outline: User should not login with invalid credentials
    Given I am on homepage
    When I click on "Log In" login link
    And I enter username "<username>" at username field
    And I enter password "<password>" at password field
    And I click on  login button
    And I should see the errormessage
    Then I close login frame
    Examples:
      | username          | password |
      | abcd123@gmail.com | xyz123   |