Feature: Glamera Login

  Background:
  @Smoke
  Scenario Outline: Invalid Login With Invalid Username and Invalid Password


    Given Open Glamera Login Page
    When Insert Invalid Phone Number "<Username>"
    And Insert Invalid Password "<Password>"
    And Click On Login Button
    Then Assert On Validation Message

    Examples:
      |Username|   |Password|
      |01145624758||123456  |


  @Smoke
  Scenario Outline: Invalid Login With Empty Username and Invalid Password


    Given Open Glamera Login Page
    When Insert Empty Phone Number "<Username>"
    And Insert Invalid Password "<Password>"
    And Click On Login Button
    Then Assert On Empty Username Validation Message
    Examples:
      |Username|   |Password|
      |        |   |123456  |