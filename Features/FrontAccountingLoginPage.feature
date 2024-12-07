Feature: Login

  @tag1
  Scenario: Verify login on frontaccountoing page.
    Given Open browser And open frontaccounting
    When Clear data of username and password
    And Enter username and password data in username and password field
    Then Verify the title after login
    And verify that sales Quatation Entry is available.
