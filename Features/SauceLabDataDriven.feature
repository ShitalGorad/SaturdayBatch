Feature: Login

  Scenario Outline: Verify login functionailty of saucedemo site.
    Given Launch Browser And open saucedemo site.
    When Enter "<username>" in Username field And some other action Enter "<password>" in password field.
    And click on login button
    Then validate login is successful.

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |
